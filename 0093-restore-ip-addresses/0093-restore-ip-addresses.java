class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String>res = new ArrayList<>() ;
        fn(s , 0 , 0 ,"" , res) ;
        return res ;
        
    }
    public void fn(String s , int i , int pat , String ans ,List<String>res ){
        
      
        if(pat == 4 && i == s.length()){
            res.add(ans.substring(0 , ans.length() -1));
            return;
        }
        
        if( i < s.length()){
        fn(s , i+1  , pat +1 , ans + s.charAt(i) + "." , res) ;
        }
        
        if(i+2 <= s.length() && isValid(s.substring(i , i+2)) ){
            
            fn(s , i+2  , pat +1 , ans + s.substring(i , i+2) + "." , res) ;
  
        }
        
        if(i+3 <= s.length() && isValid(s.substring(i , i+3)) ){
            
            fn(s , i+3  , pat +1 , ans + s.substring(i , i+3) + "." , res) ;
  
        }
    }
    
    public boolean isValid(String s){
        if(s.charAt(0) == '0' )
            return false ;
        int val = Integer.parseInt(s) ;
        if(val <= 255){
            return true ;
        }
        return false;
        
    }
}