class Solution {
    int totaltilt = 0;
    public int tilt(TreeNode root){
        if(root == null)
            return 0;
        
        int sumLeft = tilt(root.left);
        int sumRight = tilt(root.right);

        int tilt = Math.abs(sumLeft-sumRight);
        totaltilt += tilt;
        return root.val + sumLeft + sumRight;
    }
    public int findTilt(TreeNode root) {
        tilt(root);
        return totaltilt;
    }
}
