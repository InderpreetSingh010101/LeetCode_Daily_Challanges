class Solution {
    public boolean detectCapitalUse(String words) {
        
        if(words.length() == 1 ) return true ;
        
        int flag = 0 ;
        
        if(words.charAt(1) >='A' && words.charAt(1) <='Z' && words.charAt(0) >='A' && words.charAt(0) <='Z'){
            flag = 1 ;
        }else if(words.charAt(1) >='a' && words.charAt(1) <='z' && words.charAt(0) >='a' && words.charAt(0) <='z'){
            flag = -1 ;
        }else if(words.charAt(1) >='a' && words.charAt(1) <='z' && words.charAt(0) >='A' && words.charAt(0) <='Z'){
               flag = -1 ;            
        }else{
            return false ;
        }
        
        for(int i = 2 ; i < words.length() ; i++){
            if(flag == -1){
                if( !(words.charAt(i)>='a' && words.charAt(i)<='z') )
                 return false ;   
            }
            
            if(flag == 1){
                if( !(words.charAt(i)>='A' && words.charAt(i)<='Z') )
                 return false ;   
            }
            
            
        }
        return true ;
    }
}