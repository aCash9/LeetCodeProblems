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
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1 == null && root2 == null)
            return null;
        TreeNode merged = new TreeNode();
        
        if(root1 != null && root2 != null){
            merged.val = root1.val + root2.val;
            merged.left = mergeTrees(root1.left,root2.left);
            merged.right = mergeTrees(root1.right,root2.right);
        }
        else if(root1 != null && root2 == null){
            merged.val = root1.val;
            merged.left = mergeTrees(root1.left,null);
            merged.right = mergeTrees(root1.right,null);
        }
        else{
            merged.val = root2.val;
            merged.left = mergeTrees(null,root2.left);
            merged.right = mergeTrees(null,root2.right);
        }

        return merged;
    }
    // better solution
    class Solution {
    public TreeNode mergeTrees(TreeNode r1, TreeNode r2) {
        if(r1 == null)
            return r2;
            
        if(r2 == null)
            return r1;

        r1.val += r2.val;

        r1.left = mergeTrees(r1.left,r2.left);
        r1.right = mergeTrees(r1.right,r2.right);
        
        return r1;
    }
}
}
