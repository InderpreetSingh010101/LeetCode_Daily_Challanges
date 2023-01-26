class Solution {
    // 787. Cheapest Flights Within K Stops
//     will be done later again
    
   public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k){
        int[] dis = new int[n];
        Arrays.fill(dis,(int)1e9);
        dis[src] = 0;
        boolean negativeCycle = false;
        
        for(int i=1;i<=k+1;i++){
            int[] ndis = new int[n];
            
            for(int j=0;j<n;j++){
                ndis[j] = dis[j];
            }
            
            boolean isUpdate = false;
            for(int[] edge:flights){
                int u = edge[0];
                int v = edge[1];
                int w = edge[2];
                
                if(dis[u] + w < ndis[v]){
                    ndis[v] = dis[u] + w;
                    isUpdate = true;
                }
                
            }
            
            if(!isUpdate){
                    break;
            }
            
            if(i == k+1 && isUpdate){
                negativeCycle = true;
            }
            dis = ndis;
        }
        return dis[dst] == (int)1e9?-1:dis[dst];
        
    }
}