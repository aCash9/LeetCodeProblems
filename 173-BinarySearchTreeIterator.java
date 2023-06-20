/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class BSTIterator {
    List<Integer> list = new ArrayList<>();
    int index = 0;
    public void makeList(TreeNode root) {
        if(root == null)
            return;
        makeList(root.left);
        list.add(root.val);
        makeList(root.right);
    }
    public BSTIterator(TreeNode root) {
        makeList(root);
    }
    
    public int next() {
        return list.get(index++);
    }
    
    public boolean hasNext() {
        return list.size() > index;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
