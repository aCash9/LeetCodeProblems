class Solution {
public int lengthOfLongestSubstring(String s) {
        if (s.length() != 0)
            if ((int) s.charAt(0) == 32)
                return 1;
        HashSet<Character> set = new HashSet<>();
        int length = 0, max = 0, index = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (set.contains(ch)) {
                if (max < length)
                    max = length;
                length = 0;
                i = index;
                index++;
                set.clear();
                continue;
            }
            set.add(ch);
            length++;
        }
        if (length > max)
            return length;
        return max;
    }

}