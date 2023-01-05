class Solution {
    public int findMinArrowShots(int[][] points) {
        
        
        
        
        
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->{
           
                            if(a[0] == b[0]){
                            return Integer.compare(a[1] , b[1]) ;
                              
                            }
                       return Integer.compare(a[0],b[0]);    });
        
        
            
            for(int[] i  : points ){
            pq.add(i) ;
        }
        
        if(pq.size() == 1) return 1 ;
        int c = points[0].length ;
        int ans = 1 ;
        int count = 0 ;
        
        while(pq.size()!= 1){
            int a1[] = pq.remove() ;
            int a2[] = pq.remove() ;
            
            if(a1[1] >= a2[0]){
                int x = Math.max(a1[0] , a2[0]) ;
                int y = Math.min(a1[1] , a2[1]) ;
                pq.add(new int[]{x,y}) ;
                c-- ;
            }else{
                ans ++ ;
                pq.add(a2) ;
                
            }
            
            
        }
        
        return ans ;
    }
}