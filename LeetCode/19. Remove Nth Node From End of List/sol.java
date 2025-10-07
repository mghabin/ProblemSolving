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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        // Approach one: traverse list and count it, then traverse it again until reach the target node
        // Time Complexity: O(n).
        // Space Complexity: O(1).
        /*
        ListNode temp = head;
        
        // if there is just one node then delete it
        if(temp.next == null)
            return null;
        
        int size = 1;
        while(temp.next != null){
            temp = temp.next;
            size++;
        }
        
        // if the target node is the first one then delete it
        int count = size-n;
        if(count == 0){
            return head.next;
        }
        
        // if the target node is in the middle then delete it
        temp = head.next;
        ListNode prev = head;
        while(count > 1){
            temp = temp.next;
            prev = prev.next;
            count--;
        }
        prev.next = temp.next;
        return head;
        */
        
        
        // Approach two (best): seperate two pointers by N gap, then advance both pointers until the first one
        //                      reach the last node, then the first pointer is at (N+1)th node from last :)
        // Time Complexity: O(n).
        // Space Complexity: O(1).
        ListNode fastPointer = head;
        if (fastPointer.next == null)
            return null;
        
        ListNode slowPointer = null;
        
        for (int i = 1; i < n; i++) {
            fastPointer = fastPointer.next;
        }
        
        while (fastPointer.next != null) {
            fastPointer = fastPointer.next;
            if (slowPointer == null) {
                slowPointer = head;
            } else {
                slowPointer = slowPointer.next;
            }
        }
        
        if (slowPointer == null) {
            return head.next;
        }
        slowPointer.next = slowPointer.next.next;
        return head;
        
    }
}