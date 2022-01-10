class Solution 
{
    void matchPairs(char nuts[], char bolts[], int n) 
    {
        quickSort(nuts, 0 , n-1);
        quickSort(bolts, 0 , n-1);
    }
    
    static void quickSort(char a[],int lb, int ub)
    {
       int x=0;
       int i=lb;
       int j=ub;
       char t;
       
       while(i<j) 
       {
           while (a[i] < a[j] && x == 1) 
               i++;

           while (a[j] > a[i] && x == 0) 
               j--;
           
           if (i < j) 
           {
               t = a[i];
               a[i] = a[j];
               a[j] = t;
           }
           
           if (x == 0) 
               x = 1;
               
           else 
               x = 0;
        }
       
        if(lb<i)
            quickSort(a,lb,i-1);
       
        if(ub>i)
            quickSort(a,i+1,ub);
       
    }
}
