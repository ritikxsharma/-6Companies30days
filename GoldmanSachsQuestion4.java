// link:https://practice.geeksforgeeks.org/viewSol.php?subId=2e9db5e4f835a46f93c5efe88c127cf8&pid=700243&user=ritiksharma5

class GfG
 {
	String encode(String str)
	{
	    if(str.length() == 1){
	        return str + "" + 1;
	    }
	    
        int count = 1;
        StringBuilder sb = new StringBuilder();
        
		for(int i=1;i<str.length();i++)
		{
			if(str.charAt(i) == str.charAt(i-1))
				count++;
			else
			{
				
				sb.append( str.charAt(i-1) + "" + count);
				count=1;
				
			}
		}

		if(str.charAt(str.length()-1) != str.charAt(str.length()-2))
			sb.append( str.charAt(str.length()-1) + "1");
		else
			sb.append(str.charAt(str.length()-1) + "" + count);
			
		return sb.toString();
	}
	
 }
