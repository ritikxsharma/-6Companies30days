class Solution
{
    String colName (long n)
     {
        String temp="";
        while(n>0)
        {
            char ch= (char) ( 'A' + (n-1)%26);
            temp=ch+temp;
            n=(n-1)/26;
        }
        return temp;
    }
}
