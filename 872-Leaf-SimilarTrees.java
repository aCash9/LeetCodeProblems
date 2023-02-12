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
    public void endnodes(TreeNode root,ArrayList<Integer> l){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            l.add(root.val);
            return;
        }
        endnodes(root.left,l);
        endnodes(root.right,l);
    }
    
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        endnodes(root1,l1);
        endnodes(root2,l2);
        if(l1.size() != l2.size())
            return false;
        else {
            for(int i = 0; i < l1.size(); i++){
                if(l1.get(i) != l2.get(i))
                    return false;
            }
        }
        return true;
    }
}
