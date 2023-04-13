class Solution {
    public static String removeKdigits(String num, int k) {
        if (num.length() == k) {
            return "0";
        }

        StringBuilder sb = new StringBuilder(num);
        int i = 0;
        while (k > 0 && i < sb.length() - 1) {
            if (sb.charAt(i) > sb.charAt(i + 1)) {
                sb.deleteCharAt(i);
                k--;
                if (i > 0) {
                    i--;
                }
            } else {
                i++;
            }
        }
        while (k > 0) {
            sb.deleteCharAt(sb.length() - 1);
            k--;
        }

        i = 0;
        while (i < sb.length() && sb.charAt(i) == '0') {
            i++;
        }
        sb.delete(0, i);

        if (sb.length() == 0) {
            return "0";
        }
        return sb.toString();
    }
}
