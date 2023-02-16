class Solution {
public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int maxLength=0;
        for (int right = 0, left=0; right < s.length(); right++) {
            char ch = s.charAt(right);
            if(map.containsKey(ch) && map.get(ch)>=left)
                left = map.get(ch)+1;

            maxLength=Math.max(maxLength, right-left+1);
            map.put(ch, right);
        }
        return maxLength;
    }
}
