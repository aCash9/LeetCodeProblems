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
    public static void flatten(TreeNode root) {
        if(root == null)
            return;

        TreeNode r = root.right;
        TreeNode l = root.left;

        if(r == null && l == null)
            return;

        flatten(l);
        flatten(r);

        if(l == null) {
            r.left = null;
            return;
        }

        if(r == null){
            root.right = l;
            root.left = null;
            l.left = null;
            return;    
        }  

        TreeNode temp = root.left;
        while(temp.right != null)
            temp = temp.right;

        root.right = l;
        root.left = null;
        temp.right = r;
        r.left = null;
    }
}
