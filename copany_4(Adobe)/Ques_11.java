 class Solution{
    public String amendSentence(String s){
        
        // char[] ch = s.toCharArray(); 
        // StringBuilder sb = new StringBuilder();
        // if(ch[0] >=65 && ch[0] <=90)
        //     sb.append( (char) (ch[0] + ' ') );

        // else
        //     sb.append( (char) (ch[0]) );
             
        // for(int i = 1 ; i<s.length() ; i++)
        // {
        //     if(ch[i] >=65 && ch[i] <=90)
        //         sb.append( " " + (char) (ch[i] + ' ') );
            
        //     else
        //         sb.append( (char) (ch[i]) );
        
        // }
        // return sb.toString();
        
        StringBuilder sb = new StringBuilder();
        if(s.charAt(0) >=65 && s.charAt(0) <=90)
            sb.append( (char) ( s.charAt(0)+' ' ) );
        
        else
            sb.append((char) ( s.charAt(0) ) );
        
        
        for(int i = 1 ; i<s.length() ; i++)
        {
            if(s.charAt(i) >=65 && s.charAt(i) <=90)
                sb.append(" " + (char) ( s.charAt(i) + ' ' ) );
            
            else
                sb.append((char) ( s.charAt(i) ) );
        
        }
        return sb.toString();
    }
}
