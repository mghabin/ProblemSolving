/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        // swap until reach the end
        /*
        ListNode p = node.next;
        while(node.next != null){
            node.val = node.next.val;
            if(p.next != null){
                node = node.next; 
                p = p.next;
            }
            else{
                node.next = null;
            } 
        }
        */
        
        // Optimized soltion
        node.val = node.next.val;
        node.next = node.next.next;
    }
}