class Solution{
    static String decodedString(String s){

        Stack<Integer> counts = new Stack<>();
        Stack<String> result  = new Stack<>();
        
        String sb ="";// new StringBuilder();
        
        int index = 0;
        
        while(index < s.length()){
            if(Character.isDigit(s.charAt(index)))
            {
                int count =0;
                while(Character.isDigit(s.charAt(index)))
                {
                    count = 10  * count + (s.charAt(index) - '0');
                    index++;
                }
                
                counts.push(count);
                
            }
            else if(s.charAt(index) == '[')
            {
                result.push(sb.toString());
                sb = "";
                index++;
            }
            else if(s.charAt(index) == ']')
            {
                StringBuilder temp = new StringBuilder(result.pop());
                int count = counts.pop();
                
                for(int i =0; i<count ; i++){
                    temp.append(sb.toString());
                }
                sb = temp.toString();
                index++;
            }
            else
            {
                sb += s.charAt(index);
                index++;
            }
        }
        
        return sb.toString();
    }
}
