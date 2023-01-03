class Solution {
    public int minDeletionSize(String[] strs) {
//         for(String s : strs){
//             char c = s.charAt(0) ;
//             int flag = 0 ;
//             for(int i = 2 ; i < s.length ; i++){
                
//                 if(flag == 0){
//                     if(s.charAt(i) >= c){
//                         flag = 1 ;
//                         c = s.charAt(i);
//                         continue ;
//                     }else{
//                         flag = -1 ;
//                         c = s.charAt(i);
//                         continue ;
//                     }
                        
//                 }
                
//                 if(flag == 1 && s.charAt(i) )
                
//             }
//         }
        
int del = 0 ;         
        for(int j  = 0  ; j < strs[0].length() ; j++){
            
            
            for(int i = 1 ; i < strs.length  ; i++){
                if(strs[i].charAt(j) <strs[i-1].charAt(j)){
                    del++ ;
                    break ;
                }
            }
        }
        return del ;
    }
}