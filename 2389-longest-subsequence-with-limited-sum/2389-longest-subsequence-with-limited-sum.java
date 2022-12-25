class Solution {
    public int[] answerQueries(int[] nu, int[] q) {
        // ArrayList<Integer> l = new ArrayList<Integer>();
        Arrays.sort(nu) ;
        int ans[] = new int[q.length] ;
         int max = 0 , c  = 0 ;
        
        for(int i=0 ; i < q.length ; i++){
            
           
            max=0;c=0;
            
            for(int j = 0 ; j < nu.length ; j++){
                
                if((max + nu[j]) <= q[i]  ){
                    max += nu[j];
                    c++ ;
              // System.out.print("@"+max +" " + nu[j]+"&") ;
 
                }else{
                    break;
                }
               
            }
            
            // System.out.print(c) ;
             ans[i]=c;
            
        }
        return ans ;
    }
}