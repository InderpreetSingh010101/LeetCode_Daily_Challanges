class Solution {
    
//      public int sdk(int[] nums, int sum , int idx , int k, int f){
//          if(sum % k == 0 && f!=1)
//              return 1 ;
         
//          int count = 0 ;
//          for(int i = idx ; i < nums.length ; i++){
//              count+=sdk(nums , sum + nums[i] , i + 1 , k , 0) ;
             
//          }
//          return count ;
//      }
    
    public int subarraysDivByK(int[] nums, int k) {
        // int f = 1 ;
        // return sdk(nums ,0 , 0 , k , f ) ;
        HashMap<Integer , Integer > map = new HashMap<>() ;
        
        map.put(0 ,1) ;
        int ssum = 0 ;
        int c = 0;
        for(int ele  : nums){
            ssum += ele;
            int rem = ssum % k ;
            if(rem < 0){// dont understand
                rem += k ;
            }
            
            if(map.containsKey(rem)){
                c += map.get(rem) ;
                
            }
            map.put(rem , map.getOrDefault(rem , 0) + 1);
        }
        
        return c ;
    }
}