// First Approach  Bottom DOWN
class Solution {
    public int balance(TreeNode root){
        if(root == null)
            return 0;
        return Math.max(balance(root.left),balance(root.right))+1;
    }
    public boolean isBalanced(TreeNode root) {
        if(root == null)
            return true;

        int left = balance(root.left);
        int right = balance(root.right);

        if(Math.abs(left-right) <= 1 && isBalanced(root.left) && isBalanced(root.right)){
            return true;
        }
        else 
            return false;

    }
}


// Second Approach Bottom UP 
class Solution {
    public int balance(TreeNode root){
        if(root == null)
            return 0;
        int left = balance(root.left);
        int right = balance(root.right);

        if(left == -1 || right == -1)
            return -1;

        if(Math.abs(left- right) <= 1)
            return Math.max(left,right)+1;
        else 
            return -1;
    }
    public boolean isBalanced(TreeNode root) {
        return balance(root) != -1;
    }
} 
