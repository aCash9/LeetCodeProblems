/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode t = new TreeNode(); 
    public void target(TreeNode cl,TreeNode target){
        if(cl == null)
            return;
    
        if(cl.val == target.val)
            t=cl;
        
        target(cl.left,target);
        target(cl.right,target);
    }
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        target(cloned,target);
        return t;
    }
}
