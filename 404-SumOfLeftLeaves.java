class Solution {
    public int leftSum(TreeNode root, int sum){
        if(root == null)
            return 0;

        int item = 0;
        
        if(root.left != null){
            if(root.left.left == null && root.left.right == null)
                item = root.left.val;
        }
        int left = leftSum(root.left,sum);
        int right = leftSum(root.right,sum);


        return sum+left+right+item;
    }
    public int sumOfLeftLeaves(TreeNode root) {
        int sum = leftSum(root,0);
        return sum;
    }
}
