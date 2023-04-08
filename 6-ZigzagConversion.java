class Solution {
    public static String convert(String s, int numRows) {
        int l = s.length();
        if(numRows == 1)
            return s;
        
        String ans ="";
        char[][] ansString = new char[numRows][l];
        numRows--;
        for (char[] row : ansString) {
            Arrays.fill(row, '*');
        }
        int gap = 0, r = 0, c = 0;
        for(int i = 0; i < l; i++){
            char ch = s.charAt(i);
            ansString[r+gap][c] = ch;
            r++;
            if(gap == 0){
                if(r > numRows){
                    c++;
                    r = 0;
                    gap = numRows - 1;
                }
            } else {
                c++;
                r = 0;
                gap--;
            }
        }
        for(int i = 0; i <= numRows; i++)
            for(int j = 0; j <= c; j++)
                if(ansString[i][j] != '*')
                    ans += ansString[i][j];
        return ans;
    }
}
