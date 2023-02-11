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
    public void endnodes(TreeNode root){
        if(root == null){
            endNodes.add(null);
            return;
        }
        if(root.left == null && root.right == null){
            endNodes.add(root.val);
            return;
        }
        endnodes(root.left);
        endnodes(root.right);
    }
    
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        endnodes(root1);
        endnodes(root2);

        return true;
    }
}
