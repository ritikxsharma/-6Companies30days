class Solution {
    static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k) 
    {
        Stack<Integer> st = new Stack<>();
        int[] nge = new int[n];
        ArrayList<Integer> al = new ArrayList<>();
        
        st.push(n-1);
        nge[n-1] = n;
        
        for(int i = n- 2; i>=0; i--)
        {
            
            while(st.size() >0 && arr[i] >= arr[st.peek()])
                st.pop();
            
            
            if(st.size() == 0) 
                nge[i] = n;
            else 
                nge[i] = st.peek();
            
            st.push(i);
        }

        int j = 0;
        for(int i = 0; i <n - k +1;i++ )
        {
            if(j < i)
                j=i;
            
            while(nge[j] < i+k)
                j = nge[j];
            
            al.add(arr[j]);
        }
        
        return al;
    }
}
