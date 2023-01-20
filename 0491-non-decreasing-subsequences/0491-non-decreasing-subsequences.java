class Solution {
    
    
    // In this we only doing mainly these steps
    // creating every pair like 4  , 4,6  , 4,6,7 in form of array list
    
    public HashSet<List<Integer>> hs = new HashSet<>() ;
    
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<Integer> temp  = new ArrayList<>() ;
         rec(0 , temp , nums) ;
        List<List<Integer>> res = new ArrayList<>(hs) ;
        return res ;
        
    }
   
    public void rec(int idx , List<Integer>arr , int[] nums){
        if(arr.size() >= 2){  //after creating a pair we pass it and here it is chk  
            hs.add(new ArrayList(arr)); // after chking it if size of list >2 then it is added in hashset
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