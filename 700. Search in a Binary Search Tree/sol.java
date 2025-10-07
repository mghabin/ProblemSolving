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
    public TreeNode searchBST(TreeNode root, int val) {
        // Recursion Approach.
        // Time Complexity: O(n) where n is depth of the BST.
        // Space Complexity: O(n) where n is depth of the BST.
        /*
        if(root == null || root.val == val)
            return root;
        
        return val > root.val ? searchBST(root.right, val) : searchBST(root.left, val);
        */
        
        // Iterative Approach.
        // Time Complexity: O(n) where n is depth of the BST.
        // Space Complexity: O(1).
        
        while(root != null && root.val != val){
            root = val > root.val ? root.right : root.left;
        }
        
        return root;
    }
}