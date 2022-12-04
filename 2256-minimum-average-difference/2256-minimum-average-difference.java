class Solution {
    
//     public int calc(int[] nums , int ptr){
//         int avg1 = 0 , sum = 0 , c = 0 , avg2 = 0 ;
        
//         for(int i = 0 ; i <= ptr ; i++){
//             sum += nums[i] ;
//             c++ ;
//         }
//         if(sum != 0)
//         avg1 = sum / c ;
//         sum = 0;
//         c = 0;
        
//         for(int i = ptr+1 ; i < nums.length ; i++) {
//             sum +=  nums[i] ;
//             c ++ ;
//         }
        
//         if(sum != 0)
//         avg2 = sum / c ;
        
//         return Math.abs(avg1 - avg2) ;
//     }
    
    
    
//     public int minimumAverageDifference(int[] nums) {
       
//         if(nums.length == 0) return 0 ;
        
//         int min = Integer.MAX_VALUE;
//             int pos = -1 ;
//             int temp = -1 ;
        
//         for(int i = 0 ; i < nums.length ; i ++ ){
            
//               temp =  calc(nums , i) ;
           
//             if(temp < min){
//                min  = temp ;
//                 pos = i ;
//             }
                
//         }
        
//         return pos ;
        
//     }
    
     // MY SOLUTION ^^^^^Bruteforce^^^^^^^ But TLE 
    
    
    public int minimumAverageDifference(int[] nums) {
        long min = Integer.MAX_VALUE, sum = 0;
        for (int i : nums) sum += i;
        int leftIndex = 0, resultIndex = -1;
        long prefixSum = 0;

        while (leftIndex < nums.length) {
            prefixSum += nums[leftIndex];
            long leftAverage = prefixSum / (leftIndex + 1);
            long sumRight = sum - prefixSum;
            if (sumRight != 0) sumRight /= nums.length - leftIndex - 1;
            long res = Math.abs(leftAverage - sumRight);
            if (res < min) {
                min = res;
                resultIndex = leftIndex;
            }
            leftIndex++;
        }
        return resultIndex;
    }
}