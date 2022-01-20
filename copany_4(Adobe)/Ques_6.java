class Solution {
    
    public List<String> AllParenthesis(int n) 
    {
        List<String> arr = new ArrayList<>();
        backtrack(arr,"",0, 0, n);
        return arr;
        
    }
    
    public void backtrack(List<String> arr, String current_string, int open, int close, int max)
    {
        if(current_string.length() == max * 2)
        { 
            arr.add(current_string);
            return;
        }
        
        if(open < max) 
            backtrack(arr, current_string + "(", open + 1 , close, max );
            
        if(close < open) 
            backtrack(arr, current_string + ")", open, close + 1, max);
    }
