class Solution {
    public static int myAtoi(String s) {
        s = s.trim();
        Boolean sign = false;
        double num = 0;
        int index = 0;
        char[] str = s.toCharArray();
        if(index < str.length && str[index] == '+') 
            index++;
        if(index < str.length && str[index] == '-'){
            index++;
            sign = true;
        }

        if(index > 1)
            return 0;

        while(index < str.length && Character.isDigit(str[index])) {
            num = num * 10 + (str[index++] - '0');
        }
        if(sign)
            num *= -1;

        if(num > Integer.MAX_VALUE)
            num = Integer.MAX_VALUE;
        
        if(num < Integer.MIN_VALUE)
            num = Integer.MIN_VALUE;

        return (int)num;
        
    }
}
