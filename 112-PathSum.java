class Solution {
    public boolean PathSum(TreeNode root, int sum, int targetSum){
       
       if(root == null)
            return false;

       if(root.left == null && root.right == null){
           if(root.val + sum == targetSum)
            return true;
        else 
            return false;
       }
       sum+=root.val;
       if(PathSum(root.left,sum,targetSum) || PathSum(root.right,sum,targetSum))
            return true;
        else
            return false;
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null)
            return false;
        return PathSum(root,0,targetSum);
    }
}
