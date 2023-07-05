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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>>list = new ArrayList<List<Integer>>();
        helper(list, root, 0);
        Collections.reverse(list);
        return list;
    }

    public static void helper(List<List<Integer>>list, TreeNode root,int height){
        if (root == null) return;

        if (height >= list.size()){
            list.add(new ArrayList<Integer>());
        }

        list.get(height).add(root.val);
        helper(list, root.left, height+1);
        helper(list, root.right, height+1);
    }
}
