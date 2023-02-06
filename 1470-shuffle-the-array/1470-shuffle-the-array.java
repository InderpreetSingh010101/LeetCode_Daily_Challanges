class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] narr = new int[nums.length] ;
        
       int itr = 0;
        for(int i = 0 ; i < n ; i++){
            narr[itr++] = nums[i] ;
            narr[itr++] = nums[i+n];
           
            
        }
        
        return narr ;
        
    }
}