class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int tsum = 0 ;
        int minsum = nums[0] ;
        int maxsum = nums[0] ;
        int cmax = 0 ;
        int cmin =  0 ;
        
        for(int el : nums){
            cmax = Math.max(cmax + el , el);
            cmin = Math.min(cmin + el  , el) ;
            maxsum = Math.max(maxsum , cmax);
            minsum = Math.min(cmin , minsum) ;
            tsum += el ;
        }
        return maxsum > 0 ?Math.max(maxsum , tsum - minsum):maxsum;
    }
}