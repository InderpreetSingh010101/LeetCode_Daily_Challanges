class Solution {
    
//     public boolean canJ(int[] nums , int pos , int[] dp){
        
//        if(pos >= nums.length - 1){
//            dp[pos] = 1 ;
//            return true ;
//        }
        
//         if(dp[pos] !=0){
//             if(dp[pos] == -1)
//                  return false ;
//             else if(dp[pos] == 1) 
//                 return true ;
//         }
        
//         int jmp = nums[pos] ;
//         // int i = 0 ;
//         boolean flag = false ;
        
//         while(jmp > 0){
            
//             if(pos + jmp <= nums.length -1){
                
//                 // if(canJ(nums , pos + jmp) == true){
//                 //     flag = true ;
//                 // }
                
//                 boolean p = canJ(nums , pos + jmp , dp) ;
                
//                 if( p == true){
//                     dp[pos] = 1;
//                 }else{
//                      dp[pos] = -1;
//                 }
                
//                 flag |= p ;
//             }
//             jmp -- ;
//             // i++ ;
//         }
        
//         return flag ;
//     }
    
 public boolean canJum(int A[], int n) {
    int last=n-1,i,j;
    for(i=n-2;i>=0;i--){
        if(i+A[i]>=last)last=i;
    }
    return last<=0;
   }
    
    public boolean canJump(int[] nums) {
        // int dp[] = new int[nums.length];
        // return canJ(nums , 0 , dp) ;
        
        return canJum(nums , nums.length);
        
    }
}