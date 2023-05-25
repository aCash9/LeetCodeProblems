class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[] arr1 = word1.toCharArray();
        char[] arr2 = word2.toCharArray();
        int l = arr1.length + arr2.length;
        char[] newWord = new char[l];

        int i = 0, j = 0, index = 0;
        while(index != l) {
            if(i < arr1.length) {
                newWord[index++] = arr1[i++];
            }
            if(j < arr2.length) {
                newWord[index++] = arr2[j++];
            }
        }    
        return new String(newWord);
    }
}
