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
    public ListNode middleNode(ListNode head) {
        if(head == null || head.next == null ){
            return head ;
        }
      ListNode s = head ;
      ListNode f = head ;
        // f = f.next.next ;
        while(f.next!=null && f.next.next != null){
            f = f.next.next ;
            s=s.next ;
            
        }
        
        if(f.next != null){
            return s.next ;
        }else{
            return s;
        }
        
    }
}