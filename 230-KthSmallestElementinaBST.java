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
    public static int heightOfBST(TreeNode root) {
        if(root == null)
            return 0;

        return heightOfBST(root.left) + heightOfBST(root.right) + 1;
    }

    public static  int kthSmallest(TreeNode root, int k) {
        if(root == null) return 0;

        int leftH = heightOfBST(root.left);

        if(leftH + 1 == k)
            return root.val;

        if(leftH >= k)
            return kthSmallest(root.left, k);
        else 
            return kthSmallest(root.right, k - leftH - 1);
    }
}
