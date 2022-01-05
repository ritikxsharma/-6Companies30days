class Solution {
    
    public int countSubArrayProductLessThanK(long a[], long n, long k)
    {
        long product=1;
        int j=0,count=0;
        
        for(int i=0;i<n;i++)
        {
            product *= a[i];
            
            while(j < n && product >= k)
            {
                product /= a[j];
                j++;
            }
            
            count += (i-j+1);
        }
        return count;
    }
}
