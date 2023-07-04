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
//different approach 
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new LinkedList<>();
        if(root == null)
            return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()) {
            int size = q.size();
            List<Integer> list = new LinkedList<>();
            for(int i = 0; i < size; i++) {
                TreeNode temp = q.poll();
                if(temp.left != null)   q.add(temp.left);
                if(temp.right != null)   q.add(temp.right);
                list.add(temp.val);
            }
            ans.add(list);
        }
        return ans;
    }
}
