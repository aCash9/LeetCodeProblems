class Solution {
    public void helper(TreeNode root, List<Integer> list){
        if(root == null)
            return ;
        list.add(root.val);
        helper(root.left,list);
        helper(root.right,list);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        helper(root,list);
        return list;
    }
}
