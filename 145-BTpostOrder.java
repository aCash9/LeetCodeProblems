class Solution {
    public void helper(TreeNode root, List<Integer> list){
        if(root == null)
            return ;
        helper(root.left,list);
        helper(root.right,list);
        list.add(root.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        helper(root,list);
        return list;
    }
}
