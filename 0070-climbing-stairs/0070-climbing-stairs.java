class Solution {
   
    public int climbst(int N , int[] dp){
//         if(n == 0)
//             return dp[n]=1 ;
        
        
//         if(dp[n] != 0)
//             return dp[n] ;
        
        
       
//         int count  = 0 ;
//         for(int i = 1 ; i <=2 ; i++ ){
//             if(n - i >= 0){
//                count+= climbst(n-i , dp);
                
//             }
//         }
//         return dp[n] = count ;
        // tabulation
        
        for(int n = 0 ; n <=N ; n++ ){
             if(n == 0){
             dp[n]=1 ;
                 continue ;
             }
        
        
       
        
        
       
        int count  = 0 ;
        for(int i = 1 ; i <=2 ; i++ ){
            if(n - i >= 0){
               count+= dp[n-i];
                
            }
        }
        dp[n] = count ;
            // continue ;
        }
        
        return dp[N] ;
        
    }
    
    
    public int climbStairs(int n) {
        if(n == 0) return 0 ;
        int[] dp = new int[n+1];
        
        return(climbst(n , dp)) ;
        
    }
}