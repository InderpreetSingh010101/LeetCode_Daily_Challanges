class Solution {
    
    public HashSet<List<Integer>> hs = new HashSet<>() ;
    
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<Integer> temp  = new ArrayList<>() ;
         rec(0 , temp , nums) ;
        List<List<Integer>> res = new ArrayList<>(hs) ;
        return res ;
        
    }
   
    public void rec(int idx , List<Integer>arr , int[] nums){
        if(arr.size() >= 2){
            hs.add(new ArrayList(arr));
        }
        
        for(int i  = idx ;  i < nums.length ; i++){
            if(arr.size() == 0 || nums[i] >= arr.get(arr.size() -1)){
                arr.add(nums[i]) ;
                rec(i+1 , arr , nums) ;
                arr.remove(arr.size() -1);
            }
        }
    }
}