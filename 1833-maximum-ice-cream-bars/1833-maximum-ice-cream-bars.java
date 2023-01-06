class Solution {
    public int maxIceCream(int[] costs, int coins) {
       
        Arrays.sort(costs) ;
        int c = 0 ;
        for(int i = 0 ; i < costs.length ; i++){
            if(coins - costs[i] >= 0 ){
                c++ ;
                coins = coins - costs[i] ;
            }else{
                break ;
            }
        }
        
        return c ;
    }
}