class Solution {
public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int length = 0, max = 0,index;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch)) {
                if (max < length) {
                    max = length;
                }
                index=i;
                i = map.get(ch);
                map.clear();
                length = 0;
                continue;
            }
            map.put(ch, i);
            length++;
        }
        if (length > max)
            return length;
        return max;
    }
}