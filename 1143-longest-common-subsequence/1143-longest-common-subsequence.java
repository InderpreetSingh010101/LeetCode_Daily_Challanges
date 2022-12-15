// class Solution {
//     public int longestCommonSubsequence(String text1, String text2) {
//         String tx1 = "";
//         String tx2 = "";
        
//         if(text1.length() > text2.length()){
//             tx1 = text1 ;
//             tx2 = text2 ;
//         }else{
//             tx1 = text2 ;
//             tx2 = text1 ;
//         }
       
//         // int t = 0 ;
//         int count = 0 ;
        
//         for(int i = 0 ; i < tx1.length() ; i++ ){
//             if(tx2.length() == 0)
//                 break ;
            
//             if( tx2.indexOf(tx1.charAt(i)) != -1 ){
//                 int idx = tx2.indexOf(tx1.charAt(i));
//                 tx2 = tx2.substring(0,idx) + tx2.substring(idx + 1); 
//                 count ++ ;
//             }
//         }
        
        
//         return count ;    
       
        
        
//     }
// }

class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int len1 = text1.length();
        int len2 = text2.length();
        if(text1.equals(text2)){
            return len1;
        }

        int[][] dp = new int[len1+1][len2+1];
        for(int i=1;i<=len1;i++){
            for(int j=1;j<=len2;j++){
                if(text1.charAt(i-1) == text2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;

                } else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }

            }
        }


        return dp[len1][len2];
    }
}