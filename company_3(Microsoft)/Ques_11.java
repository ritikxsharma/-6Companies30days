class solve{
    
    //Function to generate binary numbers from 1 to N using a queue.
    static ArrayList<String> generate(int N)
    {
     
        ArrayList<String> al = new ArrayList<String>();
        
        for(int i = 1 ; i <= N ; i++ )
        {
            al.add(toBinary(i));
        }
        
        return al;
        
    }
    
    public static String toBinary(int decimal)
	{    
        StringBuilder str = new StringBuilder();    
        while(decimal > 0)
        {    
            
            str.append(decimal%2);    
            decimal = decimal/2;    
        }  
        str.reverse();
        return str.toString();
    }  
    
}
