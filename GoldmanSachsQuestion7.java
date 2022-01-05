class Solution {
    static int findPosition(int N , int M , int K) {
        if (M <= N - K + 1)
            return M + K - 1;
 
        M -= (N - K + 1);
        
        if (M%N == 0)
            return N;
        else
            return M%N;
    }
};
