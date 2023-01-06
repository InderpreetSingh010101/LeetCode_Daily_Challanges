class Solution {
    public boolean isNStraightHand1(int[] hand, int w) {
        
        if(hand.length % w != 0) return false ;
        
        TreeMap<Integer , Integer > cc = new TreeMap<>() ;
        
        for(int card : hand){
            if(!cc.containsKey(card)){
                cc.put(card , 1) ;
            }else{
                cc.replace(card , cc.get(card)+1);
            }
        }
        
        while(cc.size() > 0){
            int min = cc.firstKey() ;
            
            for(int temp = min ; temp <min+w ; temp++){
                if(!cc.containsKey(temp)) return false ;
                
                int count = cc.get(temp) ;
                if(count>1){
                    cc.replace(temp , count - 1);
                }else{
                    cc.remove(temp) ;
                }
            }
        }
        
        return true ;
    }
    
     public boolean isNStraightHand(int[] hand, int w) {
    
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    
        for(int e : hand){
            pq.add(e) ;
        }
    
    while(pq.size() > 0){
        int min = pq.peek();
        for(int i = min ; i < min + w ; i++){
            if(!pq.remove(i)) return false ;
        }
    }
    
    return true ;
    
     } 
}