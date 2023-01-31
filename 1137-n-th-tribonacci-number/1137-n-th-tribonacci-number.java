class Solution {
    public int tribonacci(int n) {
        
        int t0 = 0 ;
        int t1 = 1 ;
        int t2 = 1 ;
        int ts  = 0 ;
        if(n== 0) return 0 ;
        else if( n == 1 ) return 1 ;
        else if(n==2) return 1 ;
        else{
            int i = 1 ;
           
            while(i <= n-2 ){
                i++ ;
            
                ts = t2 + t1 + t0 ;
                t0 = t1 ;
                t1=t2 ;
                t2 = ts ;
            }
            
            return ts ; 
            
            
            
        }
        
    }
}