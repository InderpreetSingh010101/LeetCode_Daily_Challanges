class Solution {
//     public int minimumRounds(int[] t) {
//         HashMap<Integer , Integer> m  = new HashMap<Integer , Integer>() ;
        
//         // Store freq
        
//         for(int i = 0 ; i < t.length ; i++){
//             if(m.get(t[i]) == null){
//                 m.put(t[i] , 1) ;
//             }else{
//                 int n = m.get(t[i]) ;
//                 m.put(t[i] , n+1) ;
//             }
//         }
        
//         int ans = 0 ;
//         for(int i : m.keySet()){
//             int temp = m.get(i) ;
            
//           if(temp % 2 != 0){
              
          
//             while(temp >= 3){
//                 temp = temp % 3 ;
//                 ans ++ ;
                
//             }
//           }
            
//             while(temp >= 2 ){
//                 temp = temp % 2 ;
//                 ans ++ ;
//             }
            
//             if(temp != 0){return -1 ;}
//         }
        
//         return ans ;
        
        
//     }
    
    public int minimumRounds(int[] tasks) {
        int count = 0; HashMap<Integer,Integer> map = new HashMap<>();
        for(int x : tasks)
            map.put(x,map.getOrDefault(x,0)+1);
        for(int x : map.keySet())
            if(map.get(x)==1)return -1;
            else{
                count+=map.get(x)/3;
                if(map.get(x)%3!=0)count++;
            }
        return count;
    }
}