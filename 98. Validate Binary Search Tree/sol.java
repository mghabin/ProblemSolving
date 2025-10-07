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
    public boolean isValidBST(TreeNode root) {
        // Time Comlexity: O(n).
        // Space Complexity: O(1).
        return isValidBSTHelper(root, null, null);
    }
    
    public boolean isValidBSTHelper(TreeNode root, TreeNode left, TreeNode right){
        if(root == null)
            return true;
        
        if(left != null && root.val <= left.val)
            return false;
        
        if(right != null && root.val >= right.val)
            return false;
        
        return (isValidBSTHelper(root.left, left, root) && 
                isValidBSTHelper(root.right, root, right));
    }
}