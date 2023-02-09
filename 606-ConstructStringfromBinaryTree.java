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
    public String tree2str(TreeNode root) {
        if(root == null)
            return "";
        String str = Integer.toString(root.val);
        if(root.left != null && root.right != null)
            str += "(" + tree2str(root.left) + ")" + "(" + tree2str(root.right) + ")";
        
        else if(root.left != null && root.right == null)
            str += "(" + tree2str(root.left) + ")";

        else if(root.left == null && root.right != null)
            str += "()" + "(" + tree2str(root.right) + ")";


        return str;
    }
}
