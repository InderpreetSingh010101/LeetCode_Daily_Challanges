class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        
       
      
        
        
        
//         int rq = 0 ,rqi = -1  ; int c = 0 ,  g = 0 ,  dif = 0 ;
//         for(int i  = 0 ; i < cost.length ; i++){
//             c+=cost[i] ;
//             g+=gas[i] ;
                
//         }
//         if(!(c<=g)) return -1 ;
        
       
        
//         for(int i  = 0 ; i < cost.length ; i++){
//             dif = gas[i] - cost[i] ;
          
                
               
//             if(dif >= 0 && rq == 0){
//                 rq = dif ;
//                 rqi = i ;
//             }else if(rq >0){
//                 rq -= cost[i] ;
//                 if(rq >0)
//                 rq+=gas[i] ;
//                 else if(rq == 0){
//                     rq+=gas[i] ;
//                 }else
//                     rq = 0;
//             }else{
//                 rq = 0 ;
//             }
                
            
//         }
        
//         return rqi ;
        
//     }
        
           int c = 0 ,  g = 0 ,  dif = 0 ;
        for(int i  = 0 ; i < cost.length ; i++){
            c+=cost[i] ;
            g+=gas[i] ;
                
        }
        
        if(g < c){return -1; }
        
        int rg = 0;
        int s = 0 ;
         for(int i  = 0 ; i < cost.length ; i++){
             rg = rg + (gas[i]-cost[i]) ;
             
             if(rg < 0){
                 s = i+1 ;
                 rg = 0 ;
             }
         
         }
        return s ;
        
    }    
        
        
}