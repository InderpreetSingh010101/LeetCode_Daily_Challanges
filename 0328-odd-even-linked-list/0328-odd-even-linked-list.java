/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        ListNode odd = new ListNode(-1) ;    // dummy ptrs
        ListNode even = new ListNode(-1) ;
        ListNode optr = odd ;
        ListNode eptr = even ;
        ListNode c = head ;
        int count = 1 ;

        while(c != null){
            if(count % 2 == 0){
                eptr.next = c ;                 
                eptr = eptr.next ;
            }else{
                optr.next = c ;
                optr = optr.next ;
            }
            c = c.next ;
            count ++ ;

        }

        optr.next = null ;            // breaking the links btwn odd and even nodes
        eptr.next = null ;            // to prevent cycles 

        optr.next = even.next ;            // joining even list to odd list as asked by ques

        return odd.next ;

    }
}