class Solution {
    public int countOdds(int low, int high) {
       int i;
        if(low % 2 != 0){
            i = low ;
        }else{
           
            if(low + 1 <= high){
            i = low+1 ;
            }else{
                return 0 ;
            }
        }
        int c = 0 ;
        for( ; i<= high ; i+=2){
            c++ ;
        }
        
        return c;
        
        
    }
}