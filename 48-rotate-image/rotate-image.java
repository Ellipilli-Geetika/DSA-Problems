class Solution {
    public void rotate(int[][] matrix) {
        int[][] m  = new int[matrix.length][matrix[0].length];

        for(int i = 0; i < matrix[0].length ; i++)
        {
            for(int j = 0 ; j < matrix.length ; j++)
            {
                m[i][j] = matrix[matrix.length-1 - j][i];
                
            }
        }
        
        for(int i = 0; i < matrix[0].length ; i++)
        {
            for(int j = 0 ; j < matrix.length ; j++)
            {
                matrix[i][j] = m[i][j];
            }
        }
        
    }
}