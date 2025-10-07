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
    public ListNode reverseList(ListNode head) {
        // Approach one: Recursive.
        // Time Complexity: O(n).
        // Space Complexity: O(n).
        if (head == null || head.next == null)
            return head;
        
        ListNode rest = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return rest;
        
        
        // Approach two: iterative approach using two pointers.
        // Time Complexity: O(n).
        // Space Complexity: O(1).
        /*
        ListNode prev = null, next;
        while(head != null){
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
        */
    }
}