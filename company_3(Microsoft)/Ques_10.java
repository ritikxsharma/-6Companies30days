class Solution
{
    //Function to find the maximum money the thief can get.
    public int FindMaxSum(int arr[], int n)
    {
        if(n==0)
        	return 0;
        if(n==1)
        	return arr[0];
        if(n==2)
        	return Math.max(arr[0] , arr[1]);

        int max = 0;
        int sum1 = arr[0];
        int sum2 = Math.max(arr[0] , arr[1]);
        for(int i = 2 ; i < n ; i ++)
        {
 			max = Math.max(arr[i]+sum1 , sum2);
 			sum1 = sum2;
 			sum2 = max;
        }
        
        return max;
    }
}
