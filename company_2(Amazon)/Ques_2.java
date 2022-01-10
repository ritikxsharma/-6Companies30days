class Solution 
{
    public int longestMountain(int[] arr) 
    {   
        int res = 0;
        boolean inc = false;
        boolean dec = false;
        int i =0;
        
        if(arr.length < 3) 
            return 0;
        
        while(i < arr.length - 1)
        {
            
            if(arr[i] < arr[i+1])
            {
                int start = i;
                
                while(i < arr.length - 1 && arr[i] < arr[i+1])
                {
                    i++;
                    inc = true;
                }
                
                while(i < arr.length - 1 && arr[i] > arr[i+1])
                {
                    dec = true;
                    i++;
                }
                
                if(inc == true && dec  == true)
                {
                    res = Math.max(res, i - start + 1);
                }
                
                inc = dec = false;
                
            }
            else
                i++;                
            
        }
        return res;
    }
}
