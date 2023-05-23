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
    public TreeNode convertArrayToBST(int[] nums, int left, int right) {
        if(left > right) return null;

        int mid = (left + right) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = convertArrayToBST(nums, left, mid - 1);
        root.right = convertArrayToBST(nums, mid + 1, right);

        return root;
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0) return null;
        return convertArrayToBST(nums, 0, nums.length - 1);
    }
}
