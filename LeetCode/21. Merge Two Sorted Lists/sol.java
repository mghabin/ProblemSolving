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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Iterative Approach.
        // Time Complexity: O(n), n = minSize(list1,list2).
        // Space Complexity: O(m), m = size of the list1 and list2.
        ListNode list3 = new ListNode(-1, null);
        ListNode current = list3;
        
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                current.next = list1;
                list1 = list1.next;
            }
            else{
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }
        
        current.next = list1 == null ? list2 : list1;
        return list3.next;
        
        // Recursion Aproach.
        // Time Complexity: O(n), n = minSize(list1,list2).
        // Space Complexity: O(n), n = minSize(list1,list2).
        /*
        if(list1 == null)
            return list2;
        if(list2 == null)
            return list1;
        
        if(list1.val < list2.val){
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        }
        else{
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
        */
    }
}