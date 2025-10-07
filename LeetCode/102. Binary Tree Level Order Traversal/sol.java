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
    // Time Complexity: O(n)
    // Space Complexity: O(n).
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root != null)
            levelOrderHelper(root, list, 1);
        
        return list;
    }
    
    public void levelOrderHelper(TreeNode root, List<List<Integer>> list, int level){
        if(list.size() < level)
            list.add(new ArrayList<Integer>());
        
        list.get(level-1).add(root.val);
        
        if(root.left != null)
            levelOrderHelper(root.left, list, level+1);
        
        if(root.right != null)
            levelOrderHelper(root.right, list, level+1);
    }
}