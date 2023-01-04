class Solution {
    
    
    
    
    public int numSubarraysWithSum(int[] nums, int goal) {
        
        if(goal == 0){
            return atmostK(nums , goal) ;
        }
        
        return (atmostK(nums , goal) - atmostK(nums , goal - 1)) ;
        
    }
    
    public int atmostK(int[] nums , int goal){
        
        int si = 0 , ei = 0 , sum = 0 , ans = 0;
        
        while(ei < nums.length){
            sum += nums[ei] ;
            ei++ ;
            
            while(sum > goal){
                sum -= nums[si];
                si ++ ;
            }
            
            ans += ei - si ;
        }
        
        return ans ;
    }
}