// class Solution {
//     public String convert(String s, int numRows) {
        
//         List<Integer>ls = new ArrayList<>() ;
//         int temp = 2*(numRows) - 2 ;
        
//         if(temp == 0){
//         for(int i=0 ; i <s.length() ; i++ ){
//             ls.add(i);
//         }
//         }else{
       
//         for(int i = 0 ; i < s.length() ; ){
//             ls.add(i) ;
//              i= i+temp ;
            
//         }
//         }
        
//         StringBuilder sb = new StringBuilder() ;
//         int gap = 0 ;
//         while(gap <= numRows - 1){
//             for(int e : ls){
                
//                 if(e - gap >= 0 && gap != numRows - 1 && gap != 0){
//                     sb.append(s.charAt(e-gap)) ;
//                 }
                
//                 if(e + gap < s.length() ){
//                     sb.append(s.charAt(e+gap)) ;
//                 }
//             }
//             gap++ ;
//         }
//         return sb.toString() ;
        
//     }
// }

class Solution{
public String convert(String s, int nRows) {
    char[] c = s.toCharArray();
    int len = c.length;
    StringBuffer[] sb = new StringBuffer[nRows];
    for (int i = 0; i < sb.length; i++) sb[i] = new StringBuffer();
    
    int i = 0;
    while (i < len) {
        for (int idx = 0; idx < nRows && i < len; idx++) // vertically down
            sb[idx].append(c[i++]);
        for (int idx = nRows-2; idx >= 1 && i < len; idx--) // obliquely up
            sb[idx].append(c[i++]);
    }
    for (int idx = 1; idx < sb.length; idx++)
        sb[0].append(sb[idx]);
    return sb[0].toString();
}
}