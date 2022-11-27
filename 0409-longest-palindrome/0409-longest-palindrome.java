class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        int counter = 0, l = 0;
        for (Map.Entry<Character, Integer> e : map.entrySet()) {
            if (e.getValue() % 2 == 0)
                l += e.getValue();
            else {
                l += e.getValue() - 1;
                counter++;
            }
        }
        if (counter > 0)
            l++;
        return l;
    }
}