// class Solution {
//     public int  chk(char c  , String order , int idx ){
//         for(int i = idx ; i < order.length() ; i++){
//             if(order.charAt(i) == c) return i ;
//         }
//         return -1 ;
        
//     }
    
//     public boolean isAlienSorted(String[] words, String order) {
        
//         for(String s : words){
            
//             int i = 0 ;
//             int idx = 0 ;
//             while(i < s.length()){
//                 if( i+1<s.length() && (s.charAt(i) == s.charAt(i+1) ) )
//                     i++;
//                 idx = chk(s.charAt(i) , order , idx);
//                 if(idx == -1){
//                     return false ; 
//                 }
//             }
//         }
//     }
// }
//t d l

class Solution{
     int[] mapping = new int[26];
    public boolean isAlienSorted(String[] words, String order) {
        for (int i = 0; i < order.length(); i++)
            mapping[order.charAt(i) - 'a'] = i;
        for (int i = 1; i < words.length; i++)
            if (bigger(words[i - 1], words[i]))
                return false;
        return true;
    }

    boolean bigger(String s1, String s2) {
        int n = s1.length(), m = s2.length();
        for (int i = 0; i < n && i < m; ++i)
            if (s1.charAt(i) != s2.charAt(i))
                return mapping[s1.charAt(i) - 'a'] > mapping[s2.charAt(i) - 'a'];
        return n > m;
    }
}