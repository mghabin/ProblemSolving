/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    // Time Complexity: O(n).
    // Space Complexity: O(n).
    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBSTHelper(nums, 0, nums.length-1);
    }
    
    public TreeNode sortedArrayToBSTHelper(int[] nums, int start, int end){
        if(start > end)
            return null;
        
        int mid = (start + end)/2;
        TreeNode root = new TreeNode(nums[mid]);
        
        root.left = sortedArrayToBSTHelper(nums, start, mid-1);
        root.right = sortedArrayToBSTHelper(nums, mid+1, end);
        
        return root;
    }
}