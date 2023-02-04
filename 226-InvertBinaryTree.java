class Solution {
    public void inversion(TreeNode root){
        if(root == null)
            return;
        if(root.left == null && root.right == null)
            return ;
        
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        inversion(root.left);
        inversion(root.right);
    }
    public TreeNode invertTree(TreeNode root) {
        inversion(root);
        return root;
    }
}
