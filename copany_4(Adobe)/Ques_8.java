class Solution
{
    int atoi(String str) 
    {
	    int result = 0; 
	    int flag = 1;
	    for(char ch : str.toCharArray())
	    {
	        if(ch=='-')
	            flag = -1;
	        else if (ch<'0' || ch>'9')
	            return -1;
	        else
	            result = result*10 + ch - '0';
	    }
	    
	    return result*flag;
	    
    }
}
