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
    public Queue<Integer> q = new PriorityQueue<>();  
    public void minimums(TreeNode root){
        if(root.left == null){
            if(!q.contains(root.val))
                q.add(root.val);
            return;
        }
        if(!q.contains(root.val))
            q.add(root.val);
        minimums(root.left);
        minimums(root.right);
    }
    public int findSecondMinimumValue(TreeNode root) {
        minimums(root);
        if(q.size() == 1)
            return -1;
        else{
            q.poll();
            return q.poll();
        }   
    }
}
