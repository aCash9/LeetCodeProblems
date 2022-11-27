class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length()>magazine.length())
            return false;
        int[] arr = new int[26];
        for(char i : magazine.toCharArray()){
            arr[i-'a']++;
        }
        for(char i : ransomNote.toCharArray()){
            if(arr[i-'a']==0)
                return false;
            arr[i-'a']--;
        }
        return true;
    }
}