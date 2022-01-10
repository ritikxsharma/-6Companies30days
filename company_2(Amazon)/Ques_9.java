class Solution{
    static int isValid(int mat[][]){
        HashSet<String> seen = new HashSet<>();

        for(int i =0; i< 9;i++)
        {
            for(int j =0; j< 9;j++)
            {
                int curr = mat[i][j]; 
                if(curr != 0 )
                {
                    if(!seen.add(String.valueOf(curr) + " found in row " + String.valueOf(i)) ||
                        !seen.add(String.valueOf(curr) + " found in columns " + String.valueOf(j)) ||
                        !seen.add(String.valueOf(curr) + " found in sub box " 
                        + String.valueOf(i/3) + "-" + String.valueOf(j/3))) 
                            return 0; 
                      
                }
            } 
          
        }
        
        return 1;
    }
