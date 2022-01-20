class Solution {
    int lengthOfLongestAP(int[] A, int n) 
    {
        if(A.length == 1) 
            return 1;
        
        if(A.length == 2) 
            return 2;
            
        HashMap<Integer, Integer>[] dp = new HashMap[A.length];
        
        int max = 0;
        for(int i =0; i< A.length; i++)
        {
            int curr = A[i];
            dp[i] = new HashMap<>();
            HashMap<Integer, Integer> cuMap = dp[i];
            
            for(int j =0; j <i;j++)
            {
                int diff = curr - A[j];
                HashMap<Integer, Integer> prev = dp[j];
                
                int newva = prev.getOrDefault(diff, 0) + 1;
                cuMap.put(diff, newva);
                dp[i] = cuMap;
                max = Math.max(max, newva);
                
            }
        }

        return max+1;
    }
}
