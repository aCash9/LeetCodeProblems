class Solution {
    public int minOperations(String[] logs) {
        int operations = 0;
        Stack<String> st = new Stack<>();
        st.add("main");
        for (String str : logs) {
            if (str.equals("../")) {
                if (!st.peek().equals("main"))
                    st.pop();
            } else if (str.equals("./"))
                continue;
            else
                st.add(str);
        }
        while (!st.peek().equals("main")) {
            operations++;
            st.pop();
        }

        return operations;
    }
}
