// class Solution {
//     public int evalRPN(String[] tokens) {
//         Stack<String> st = new Stack<>() ;
        
//         for(String s : tokens){
            
//             if(isOperator(s)){
             
//                 int s1 = Integer.parseInt(st.pop()) ;                                                       int s2 = Integer.parseInt(st.pop()) ;  
//                 int ans = 0 ;
                
//                 if(s.equals("+")){
//                     ans = s1+s2 ;
//                 }else if(s.equals("-")){
//                    ans = s2+s1 ;
//                 }else if(s.equals("*")){
//                     ans = s1+s2 ;
//                 }else if(s.equals("/")){
//                     ans = s2/s1 ;
//                 }
                
//                 st.push(ans+"") ;
//             }
            
// //             if(s=="+" || s=="-" || s=="*" || s=="/"){
                
// //                 if(s == "+"){
// //                     int s1 = Integer.parseInt(st.pop()) ;
// //                     int s2 = Integer.parseInt(st.pop()) ;
// //                     st.push(Integer.toString(s1+s2)) ;
// //                 // }else  if(s == "-"){
// //                 //     int s1 = st.pop() ;
// //                 //     int s2 = st.pop() ;
// //                 //     st.push(s2 - s1) ;
// //                 }else  if(s == "*"){
// //                       int s1 = Integer.parseInt(st.pop()) ;
// //                     int s2 = Integer.parseInt(st.pop()) ;
// //                     st.push(Integer.toString(s1*s2)) ;
// //                 // }else  if(s == "/"){
// //                 //     int s1 = st.pop() ;
// //                 //     int s2 = st.pop() ;
// //                 //     int s3 = s2 / s1 ;
// //                 //     st.push(s3) ;
// //                 }
// //               }
            
//             else { // must be a no
                
                
//                 st.push(s) ;
//                 }
//            }
        
//          int ans =Integer.parseInt(st.pop()) ;
        
//         return ans ;
       
//     }
    
//     public boolean isOperator(String s){
//         if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/"))
//             return true ;
        
//         else
//             return false ;
//     }
    
       
// }

// BSDK sab logic theek hai bas ajj ka din khrab hai islye chl ni raha ye
// mai cpy paste kar raha hun


class Solution {
    // TC  : O(n)

    public int evalRPN(String[] tokens) {
        Stack<String> st = new Stack<>();

        for(String el: tokens){
            if(isOperator(el)){

                int el2 = Integer.parseInt(st.pop());
                int el1 = Integer.parseInt(st.pop());
                int ans = 0;

                if(el.equals("*")){
                    ans = el1 *el2;
                } else if(el.equals("/")){
                    ans = el1/el2;
                }else if(el.equals("+")){
                    ans = el1 +el2;
                }else if(el.equals("-")){
                    ans = el1 -el2;
                }
                st.push(ans+"");
            } else {
                // operand
                st.push(el);
            }
        }

        return Integer.parseInt(st.peek());
    }

    private boolean isOperator(String el){
        if(el.equals("*") || el.equals("+") || el.equals("-") || el.equals("/")){
            return true;
        } else {
            return false;
        }
    }
}