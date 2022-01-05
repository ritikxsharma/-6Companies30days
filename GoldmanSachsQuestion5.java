
class Solution {
    /* Function to get the nth ugly number*/
    long getNthUglyNo(int n) 
    {
        long ugly[] = new long[n];
        int i2 = 0, i3 = 0, i5 = 0;
        long m2 = 2;
        long m3 = 3;
        long m5 = 5;
        long nextUgly = 1;
 
        ugly[0] = 1;
 
        for (int i = 1; i < n; i++)
        {
            nextUgly = Math.min(m2, Math.min(m3,m5));
 
            ugly[i] = nextUgly;
            if (nextUgly == m2)
            {
                i2 = i2 + 1;
                m2 = ugly[i2] * Long.valueOf(2);
            }
            if (nextUgly == m3)
            {
                i3 = i3 + 1;
                m3 = ugly[i3] * Long.valueOf(3);
            }
            if (nextUgly == m5)
            {
                i5 = i5 + 1;
                m5 = ugly[i5] * Long.valueOf(5);
            }
        }
        return nextUgly;
    }
}
