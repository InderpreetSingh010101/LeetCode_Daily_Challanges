class Solution {
    public int findMinArrowShots(int[][] points) {
//         int n = points.length ;
//         Arrays.sort(points,(a,b)->{
//             return a[1] == b[1] ? a[1] - b[1] : a[0] - b[0] ;
//         } );
       
//         int ans = 0 ; int ei = 0 ;
//         for(int i = 0 ; i < n ; i++){
//             int a1[] = points[i] ;
            
//             if(ei == 0){
//             ei = a1[1] ;
//             ans++ ;    
//             }else{
//                 if( a1[0] >= ei){
//                     ans++ ;
//                     ei = a1[1] ;
//                 }
//             }
            
            
//         }
            
//          return ans ;   
        
        Arrays.sort(points , (a,b)->Integer.compare(a[1] , b[1]));
        
        int arrow = 1 ;
        int reach = points[0][1] ;
        
        
        for(int i = 1 ; i < points.length ; i++){
            if(points[i][0] > reach){
                arrow++ ;
                reach = points[i][1] ;
                
            }else{
                
            }
        }
        
        return arrow ;
    }
}