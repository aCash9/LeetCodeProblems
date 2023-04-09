class Solution {
    public static String longestPalindrome(String s) {
        if(s.isEmpty() && s.length() <= 1)
            return "";

        int start = 0;
        int end = 0;
        for(int i = 0; i < s.length(); i++){
            int len1 = expandElem(s, i, i);
            int len2 = expandElem(s, i, i + 1);
            int len = Math.max(len1, len2);

            if(len > end - start){
                start = i - (len - 1)/2;
                end = i + (len/2);
            }
        }
        return s.substring(start, end + 1);
    }
    public static int expandElem(String s, int start, int end){
        if(s.isEmpty() || start > end)
            return 0;

        while(start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
            start--;
            end++;
        }
        return end - start - 1;
    }
}
