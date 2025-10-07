/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        // Approach two: Use hashset.
        // Time Complexity: O(n).
        // Space Complexity: O(n).
        /*
        HashSet<ListNode> hash = new HashSet<ListNode>();
        while(head != null){
            if(hash.contains(head))
                return true;
            hash.add(head);
            head = head.next;
        }
        
        return false;
        */
        
        // Approach two: Use two pointers.
        // Time Complexity: O(n).
        // Space Complexity: O(1).
        
        if(head == null || head.next == null)
            return false;
        
        ListNode fast, slow;
        fast = slow = head;
        
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow)
                return true;
        }
        
        return false;
        
    }
}