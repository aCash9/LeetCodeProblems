class Solution {
    public boolean sym(TreeNode r1,TreeNode r2){
        if(r1 == null && r2 != null)
            return false;
        else if(r1 != null && r2 == null)
            return false;
        else if(r1 == null && r2 == null)
            return true;

        if(r1.val == r2.val && sym(r1.left,r2.right) && sym(r1.right,r2.left))
            return true;
        else 
            return false;
    }
    public boolean isSymmetric(TreeNode root) {
        return sym(root.left,root.right);
    }
}
