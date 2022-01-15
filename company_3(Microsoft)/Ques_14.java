class Solution{
    static int minSteps(int D)
    {
        int sum=0;
        int steps=0;
        while(sum < D || (sum-D)%2 != 0)
        {
        	steps++;
        	sum += steps;
        }
        return steps;	
    }
}
