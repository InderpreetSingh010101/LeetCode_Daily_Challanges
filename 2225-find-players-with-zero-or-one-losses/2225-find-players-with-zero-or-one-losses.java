class Solution {
    public List<List<Integer>> findWinners(int[][] a) {
        TreeMap<Integer,Integer> cc = new TreeMap<>() ;
        
        for(int i = 0  ; i < a.length ; i++ ){
            if(!cc.containsKey(a[i][0])){
                cc.put(a[i][0] , 0);
            }
            
            if(!cc.containsKey(a[i][1])){
                cc.put(a[i][1] , 1);
            }else if(cc.containsKey(a[i][1])){
                cc.replace(a[i][1] , cc.get(a[i][1]) + 1 );
            }
        }
        
        List<Integer>a1 = new ArrayList<>() ;
        List<Integer>a2 = new ArrayList<>() ;
        List<List<Integer>>aa = new ArrayList<>() ;
        
        for(int k : cc.keySet()){
            int freq = cc.get(k) ;
            
            if(freq == 0)
                 a1.add(k) ;
            else if(freq == 1)
                 a2.add(k) ;
        }
        
        aa.add(a1) ;
        aa.add(a2) ;
        return aa ;
    }
}