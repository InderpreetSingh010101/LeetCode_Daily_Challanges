class Solution {
    
    public int[][] dir = {{1,1} , {1,0} , {1,-1}} ;
    
    
    
    public int minS(int[][] m , int r , int c , int[][] dp){
        if(r == m.length -1){
           dp[r][c] = m[r][c];
            return dp[r][c] ;
        }
        
        if(dp[r][c] != 0)
            return dp[r][c] ;
        
        int min = (int)1e9 ;
        for(int d[] : dir){
            int row = r + d[0] ;
            int col = c + d[1] ;
            
            if(col >= 0 && col < m[0].length && row < m.length ){
                min = Math.min(minS(m , row , col , dp) , min);
            }
        }
       
        dp[r][c] = min+m[r][c] ;
        return dp[r][c] ;
    }
    
    public int minFallingPathSum(int[][] matrix) {
        int[][] dp = new int[matrix.length][matrix[0].length] ;
       int min = (int)1e9 ;
        for(int i = 0 ; i < matrix[0].length ; i++)
            min = Math.min(minS(matrix , 0 , i , dp), min) ;
        
        return min ;
        
    }
}