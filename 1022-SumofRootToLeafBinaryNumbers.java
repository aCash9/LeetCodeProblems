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
    public ArrayList<String> list = new ArrayList<>();
    public String nums = "";
    public void numbers(TreeNode root){
        if(root == null)
            return;
        nums += Integer.toString(root.val);
        if(root.left == null && root.right == null){ 
            list.add(nums);
            return;
        }
        if(root.left != null){
            numbers(root.left);
            nums = nums.substring(0,nums.length()-1);
        }
        if(root.right != null){
            numbers(root.right);
            nums = nums.substring(0,nums.length()-1);
        }
    }
    static int binaryToDecimal(String n)
    {
        String num = n;
        int dec_value = 0;
        int base = 1;
 
        int len = num.length();
        for (int i = len - 1; i >= 0; i--) {
            if (num.charAt(i) == '1')
                dec_value += base;
            base = base * 2;
        }
 
        return dec_value;
    }
    public int sumRootToLeaf(TreeNode root) {
        numbers(root);
        int sum = 0;
        for(String str : list){
            sum += binaryToDecimal(str);
        }
        return sum;
    }
}
// better Solution
class Solution {
    public int totalSum = 0;
    public void sum(TreeNode root, int num){
        if(root != null){
            num = (num << 1) | root.val;
            if(root.left == null && root.right == null){
                totalSum += num;
            }
            sum(root.left,num);
            sum(root.right,num);
        }
    }
    public int sumRootToLeaf(TreeNode root) {
        sum(root, 0);
        return totalSum;
    }
}
