class Solution {
public int lengthOfLongestSubstring(String s) {
        if (s.length() != 0)
            if ((int) s.charAt(0) == 32)
                return 1;
        HashSet<Character> set = new HashSet<>();
        int max = 0;
        for (int i = 0; i < s.length() ; i++) {
            int length = 0;
            for (int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);
                if (!set.add(ch)) {
                    set.clear();
                    break;
                }
                set.add(ch);
                length++;
            }
            if (max < length)
                max = length;
        }
        return max;
    }
}