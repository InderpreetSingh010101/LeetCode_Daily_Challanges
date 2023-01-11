class Solution {
   
    
    public int dfs(HashMap<Integer , List<Integer> > map , List<Boolean> hasApple , int parent , int child){
        
        
        if(!map.containsKey(child)){
            return 0 ;
        }
        
        int childC = 0 , totalC = 0  ; 
        for(int e : map.get(child)){
            if(e == parent)
                continue ;
            
            childC = dfs(map , hasApple , child , e) ;
            
            if(childC > 0 || hasApple.get(e) ){
                totalC += childC + 2 ;
            }
            
            
        }
        return totalC ;
    }
    
    public int minTime(int n, int[][] edges, List<Boolean> hasApple) {
       
       
        
        
        
        
        HashMap<Integer , List<Integer> > map = new HashMap<>() ;
        
        for(int e[] : edges){
            int a = e[0] , b = e[1] ;
            map.computeIfAbsent(a , value->new ArrayList<Integer>()).add(b) ;
            map.computeIfAbsent(b , value->new ArrayList<Integer>()).add(a) ;
        }
        
        return dfs(map  , hasApple , -1 , 0) ;
        
    }
}