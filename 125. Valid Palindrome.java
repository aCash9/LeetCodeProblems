class Solution {
    public boolean isPalindrome(String s) {
       boolean ans = true;
       int i = 0, j = s.length() - 1;
       while(i <= j) {
           char ch1 = s.charAt(i);           
           char ch2 = s.charAt(j); 

           if(!validChar(ch1)) { i++; continue; }            
           if(!validChar(ch2)) { j--; continue; }         

           if(ch1 >= 65 && ch1 <= 90)
                ch1 = (char)(ch1 + 32);          

           if(ch2 >= 65 && ch2 <= 90)
                ch2 = (char)(ch2 + 32);  

            if(ch1 == ch2) {
                i++;
                j--;
            } else {
                ans = false;
                break;
            }
        }
       return ans;
    }

    public boolean validChar(char ch) {
        if((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122) || (ch >= 48 && ch <= 57))
            return true;
        else 
            return false;
    }
}
