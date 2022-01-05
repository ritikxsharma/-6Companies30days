class Solution {
    public boolean canPair(int[] nums, int k) 
    {
        HashMap<Integer, Integer> rfm = new HashMap<>();
        
        for(int val: nums )
        {
            int rem = val % k;
            
            int oldfre = rfm.getOrDefault(rem, 0);
            rfm.put(rem, oldfre + 1);
        }
        
        for(int val : nums)
        {
            int rem = val % k;
            
            if(rem == 0)
            {
                int fre = rfm.get(rem);
                if((fre & 1) == 1)
                     return false;
                
                
            }
            else if(2 * rem == k)
            {
                int fre = rfm.get(rem);
                if((fre & 1) == 1)
                  return false;   
                
            }
            else
            {
                
                int fre = rfm.get(rem);
                int ofre = rfm.getOrDefault(k - rem , 0);
                if(fre != ofre)
                    return false;
            }
        }
        
        return true;
    }
}
