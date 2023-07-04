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
    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new LinkedList<>();
        if(root == null)
            return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean order = true;
        while(!q.isEmpty()) {
            int size = q.size();
            List<Integer> list = new LinkedList<>();
            for(int i = 0; i < size; i++) {
                TreeNode temp = q.poll();
                if(temp.left != null)   q.add(temp.left);
                if(temp.right != null)   q.add(temp.right);
                list.add(temp.val);
            }
            if(!order)
                Collections.reverse(list);
            ans.add(list);
            order = !order;
        }
        return ans;
    }
}
