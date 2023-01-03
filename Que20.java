package LeetCodeProgramsDSA;

import java.util.Stack;

public class Que20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] ch = s.toCharArray();
        for(char temp : ch){
            if(temp=='(' || temp=='{' || temp=='['){
                stack.push(temp);
                continue;
            }else if(stack.isEmpty()){
                return false;
            }
            char top = stack.pop();
            if(temp==')' && top!='(')
                return false;
            else if(temp=='}' && top!='{')
                return false;
                else if (temp==']' && top!='[')
                 return false;
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Que20 obj = new Que20();
        String str = new String("([)]");
        System.out.println(obj.isValid(str));
    }
}
// Arrays.sort(strs);
//         String subSet = "";
//         String small = strs[0];
//         String big = strs[strs.length - 1];
//         for (int i = 0; i < small.length(); i++) {
//             if (small.charAt(i) == big.charAt(i)) {
//                 subSet=subSet+small.charAt(i);
//             }
//             else 
//             break;
//         }
//         return subSet;