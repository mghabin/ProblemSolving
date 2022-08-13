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
    public boolean isPalindrome(ListNode head) {
        // Apprach one: add the second half of list to stack then start comparing the stack with first half of list
        // Time Complexity: O(n).
        // Space Complexity: O(n).
        /*
        if(head.next == null)
            return true;
        
        ListNode slow, fast;
        slow = fast = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        
        Stack stack1 = new Stack();
        while(slow != null){
            stack1.push(slow.val);
            slow = slow.next;
        }
        
        while(!stack1.isEmpty()){
            int x = (int)stack1.pop();
            if(x != fast.val)
                return false;
            
            fast = fast.next;
        }
        
        return true;
        */
        
        // Apprach two: Reverse second half of list then use two pointer to compare first and second half.
        // Time Complexity: O(n).
        // Space Complexity: O(1).
        
        if(head == null || head.next == null)
            return true;
        
        ListNode slow,fast;
        slow = fast = head;
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        
        slow.next = reverseList(slow.next);
        slow = slow.next;
        
        while(slow != null){
            if(head.val != slow.val)
                return false;
            slow = slow.next;
            head = head.next;
        }
        
        return true;
    }
    
    public ListNode reverseList(ListNode head){
        ListNode prev = null, next;
        while(head != null){
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}