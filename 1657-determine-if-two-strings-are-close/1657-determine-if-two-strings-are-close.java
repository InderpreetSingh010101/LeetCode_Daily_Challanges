// class Solution {
//     public boolean closeStrings(String word1, String word2) {
//         int[] f1 = new int[26] ;
//         int[] f2 = new int[26] ;
        
//         Set<Character> s1 = new HashSet<>() ;
//         Set<Character> s2 = new HashSet<>() ;
        
//         for(char c : word1.toCharArray()){
//             f1[c - 'a']++ ;
//             s1.add(c) ;
//         }
//          for(char c : word2.toCharArray()){
//             f2[c - 'a']++ ;
//             s2.add(c) ;
//         }
        
//         Set<Integer> fs1 = new HashSet<>() ;
//         Set<Integer> fs2 = new HashSet<>() ;
        
//         for(int f : f1){
//             fs1.add(f) ;
//         }
        
//         for(int f : f2){
//             fs2.add(f) ;
//         }
        
//         return s1.equals(s2) && fs1.equals(fs2);
//     }
    
    
// }
// one test case failing sol from coded decode


class Solution {
    private int N = 26;
    public boolean closeStrings(String word1, String word2) {
		// count the English letters
        int[] arr1 = new int[N], arr2 = new int[N];
        for (char ch : word1.toCharArray())
            arr1[ch - 'a']++;
        for (char ch : word2.toCharArray())
            arr2[ch - 'a']++;
		
		// if one has a letter which another one doesn't have, dont exist
        for (int i = 0; i < N; i++) {
            if (arr1[i] == arr2[i]) {
                continue;
            }
            if (arr1[i] == 0 || arr2[i] == 0) {
                return false;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for (int i = 0; i < N; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}