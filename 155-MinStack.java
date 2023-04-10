class MinStack {
    node top;

    public class node {
        int data;
        node next;
        int min;

        public node(int data) {
            this.data = data;
            this.next = null;
            this.min = data;
        }
    }

    public void push(int val) {
        node temp = new node(val);
        if(top == null)
            top = temp;
        else {
            temp.next = top;
            temp.min = Math.min(temp.min, top.min);
            top = temp;
        }
    }
    
    public void pop() {
        node temp = top;
        top = top.next;
    }
    
    public int top() {
        return top.data;
    }
    
    public int getMin() {
        return top.min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
