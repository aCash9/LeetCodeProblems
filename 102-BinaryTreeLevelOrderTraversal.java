class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new LinkedList<>();
        helper(root, ans, 0);
        return ans;
    }
    public void helper(TreeNode root, List<List<Integer>> ans, int level) {
        if(root == null)    
            return;
        
        if(level == ans.size())
            ans.add(new ArrayList<>());

        ans.get(level).add(root.val);

        helper(root.left, ans, level + 1);
        helper(root.right, ans, level + 1);
    }
}
