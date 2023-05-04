class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Deque<Node> s = new ArrayDeque<>();
        int[] ans = new int[temp.length];

        for(int i = temp.length - 1; i >= 0; i--) {
            while(!s.isEmpty() && s.peekLast().val <= temp[i])
                s.removeLast();

            if(s.isEmpty())
                ans[i] = 0;
            else {
                ans[i] = s.peekLast().index - i;
            }

            Node n = new Node();
            n.val = temp[i];
            n.index = i;
            s.addLast(n);
        }

        return ans;
    }
}
    class Node {
        int index;
        int val;
        Node(){}

        Node(int value, int indx) {
            this.index = indx;
            this.val = value;
        }
    }
