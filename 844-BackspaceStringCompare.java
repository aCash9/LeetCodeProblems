class Solution {
    public static boolean backspaceCompare(String s, String t) {
        for (int i = 0; s != "" && i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '#') {
                if (i == 0) {
                    s = s.substring(1);
                    i = i - 1;
                } else {
                    if (i < s.length() - 1)
                        s = s.substring(0, i - 1) + s.substring(i + 1);
                    else
                        s = s.substring(0, i - 1);
                    i = i - 2;
                }
            }
        }

        for (int i = 0; t != "" && i < t.length(); i++) {
            char ch = t.charAt(i);
            if (ch == '#') {
                if (i == 0) {
                    t = t.substring(1);
                    i = i - 1;
                } else {
                    if (i < t.length() - 1)
                        t =t.substring(0, i - 1) + t.substring(i + 1);
                    else
                        t = t.substring(0, i - 1);
                    i = i - 2;
                }
            }
        }
        if (s.compareTo(t) == 0)
            return true;
        else
            return false;
    }
    //better approach
    class Solution {
    public static boolean backspaceCompare(String s, String t) {
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();

        char[] cs = s.toCharArray();
        char[] ct = t.toCharArray();

        int backc = 0;
        for(int i = cs.length - 1; i >= 0; i--) {
            if(cs[i] == '#')
                backc++;
            else if(backc > 0)
                backc--;
            else str1.append(cs[i]);            
        }

        backc = 0;
        for(int i = ct.length - 1; i >= 0; i--) {
            if(ct[i] == '#')
                backc++;
            else if(backc > 0)
                backc--;
            else str2.append(ct[i]);            
        }

        String s1 = str1.toString();
        String s2 = str2.toString();

        return s1.equals(s2);
    }
}
}
