class Solution {
    public boolean isSubsequence(String str, String t1) {
        if(str.equals(""))
            return true;
        
        char[] s = str.toCharArray();
        char[] t = t1.toCharArray();
            
        int count = 0;
        for(int i = 0; i < t.length; i++) {
            if(count == s.length)
                break;
            
            if(s[count] == t[i]) {
                count++;
            }
        }
        return count == s.length;
    }
}
