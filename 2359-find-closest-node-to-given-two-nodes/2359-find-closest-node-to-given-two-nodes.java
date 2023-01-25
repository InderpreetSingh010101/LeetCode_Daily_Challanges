class Solution {
    public int closestMeetingNode(int[] edges, int node1, int node2) {
       int n = edges.length ;
        int[] dist1 = new int[n] ;
        
        Arrays.fill(dist1 , -1) ;
        
        int[] dist2 = new int[n] ;
        
        Arrays.fill(dist2 , -1) ;
        
      int idx = node1 ;
      int dis = 0 ;  
        while(true){
            dist1[idx] = dis++ ;
             idx = edges[idx]   ;
            if(idx == -1 || dist1[idx] != -1) {break ;}
                
        }
        
        idx = node2 ;
       dis = 0 ;  
        while(true){
            dist2[idx] = dis++ ;
             idx = edges[idx]   ;
            if(idx == -1 || dist2[idx] != -1) {break ;}
                
        }
        
        int min = Integer.MAX_VALUE ;
        int ans = -1 ;
        
        for(int i = 0 ; i < n ; i++ ){
            
            if(dist1[i] == -1 || dist2[i] == -1) continue ;
            
            if(min > Math.max(dist1[i] , dist2[i])){
                min = Math.max(dist1[i] , dist2[i]) ;
                ans = i ;
            }
        }
        
        
        return ans ;
        
    }
}