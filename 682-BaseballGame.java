import java.util.*;

class Solution {
    public int calPoints(String[] operations) {
        int sum = 0;
        Stack<Integer> st = new Stack<>();
        for (String str : operations) {
            if(str.equals("C")){
                st.pop();
            }
            else if(str.equals("D")){
                int score = st.peek()*2;
                st.push(score);
            }
            else if(str.equals("+")){
                int lastscore = st.pop();
                int secondlastscore = st.peek();
                st.push(lastscore);
                st.push(lastscore+secondlastscore);
            }
            else {
                st.push(Integer.valueOf(str));
            }
        }
        for(int score : st)
            sum+=score;
        return sum;
    }
    public static void main(String[] args) {
        Solution obj = new Solution();
        String[] str = {"1","C"};
        System.out.println(obj.calPoints(str));
    }
}
