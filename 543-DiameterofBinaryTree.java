class Solution {
    public int diameter(TreeNode root,int counter){
        if(root == null)
            return 0;
        int left = 0, right = 0;
        if(root.left != null){
            left ++;
            left += diameter(root.left,counter+1);
        }
        if(root.right != null){
            right++;
            right += diameter(root.right,counter+1);
        }
        if(counter == 0)
            return left+right;
        else 
            return Math.max(left , right);
    }
    int maxdiameter = Integer.MIN_VALUE;
    public void diameterBinaryTree(TreeNode root) {
        if(root == null)
            return;
        
        maxdiameter = Math.max(maxdiameter,diameter(root,0));
        diameterBinaryTree(root.left);
        diameterBinaryTree(root.right);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        diameterBinaryTree(root);
        return maxdiameter; 
    }
}
