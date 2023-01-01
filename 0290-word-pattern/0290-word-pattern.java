class Solution {
//     public boolean wordPattern(String pattern, String s1) {
//         // Stack<Character> s =new Stack<>() ;
//         char[] a1 = pattern.toCharArray();
//         String[] words = s1.split(" ");
        
//         String a = "" , b = "" ;
         
//         if(a1.length != words.length) return false ;
        
//         for(int i = 1 ; i < a1.length ; i++){
            
//             if(a1[i-1] == a1[i]){
//                 if( words[i-1].equals(words[i]) ){
//                     continue ;
//                 }else{
//                     return false;
//                 }
//             }else{
//                          if(a.equals("") && b.equals("") ){
//                              a = words[i-1];
//                              b = words[i] ;
//                          }
                  
//                 if( !(words[i-1].equals(words[i]))  ){
                  
//                     if(a.equals(words[i]) || a.equals(words[i-1]) ||b.equals(words[i]) || b.equals(words[i-1]) )
//                     continue ;
//                     else
//                         return false ;
                    
//                 }else{
//                     return false ;
//                 }
//             }
            
//             // if(s.isEmpty()){
//             //     s.push(a1[i]);
//             // }else{
//             //     if(s.peek)
//             // }
            
//         }
//         return true ;
//     }
    
     public boolean wordPattern(String pattern, String s1) {
         // char[] a1 = pattern.toCharArray();
        String[] words = s1.split(" ");
         if(pattern.length() != words.length) return false ;
         HashMap<Character , String> map = new HashMap<Character, String>();
         
         for(int i = 0 ;  i < pattern.length()  ; i++){
             char c = pattern.charAt(i) ;
             
             if(map.containsKey(c)){
                 
                 if(!map.get(c).equals(words[i]))
                     return false ;
                 
             }else{
                 if(map.containsValue(words[i])) return false ;
                 map.put(c , words[i] );
             }
             
         }
         return true ;
         
     }
    
}