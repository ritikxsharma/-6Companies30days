class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int S) 
    {
        int sum = 0;
        int start = 0;
        int end = 0;
        for(int i = 0; i < n; i++){
            sum += arr[i];
            if(sum == S)
            {
                end = i+ 1;
                start++;
                break;
            }
            
            while(sum > S)
            {
                sum -= arr[start];
                start++;
                
                if(sum == S)
                {
                    end = i +1;
                    start++;
                    i=n;
                }
            }
        }
        ArrayList<Integer> al = new ArrayList<>();
        if(sum != S)
        {
            al.add(-1);
            return al;
        }
        
        al.add(start);
        al.add(end);
        
        return al;
    }
}
