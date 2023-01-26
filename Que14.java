package LeetCodeProgramsDSA;

import java.util.*;

public class Que14 {
    public String prefix(String subset, String temp) {
        int size = 0;
        if (subset.charAt(0) != temp.charAt(0)) {
            return "";
        }
        for (int i = 1; i < subset.length() && i < temp.length(); i++) {
            if (subset.charAt(i) == temp.charAt(i)) {
                size++;
            }
        }
        return subset.substring(0, size + 1);
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs[0] == "" || strs.length == 0) {
            return "";
        }
        String subset = new String();
        String temp = new String();
        subset = strs[0];
        for (int i = 1; i < strs.length; i++) {
            temp = strs[i];
            subset = prefix(subset, temp);
            if (subset == "") {
                return "";
            } else
                continue;
        }
        return subset;
    }

    public static void main(String[] args) {
        String[] strs = { "", "" };
        Que14 obj = new Que14();
        String subset = obj.longestCommonPrefix(strs);
        System.out.println(subset);
    }
}

// Another Approach

// public String longestCommonPrefix(String[] strs) {
// String r="";
// int n=strs.length;
// Arrays.sort(strs);//Sorted first
// String s=strs[0];//smallest no of char
// String h=strs[n-1];//highest no of char
// for(int i =0;i<s.length();i++)//taken smallest length so that run time will
// be less
// {
// if(s.charAt(i)!=h.charAt(i)) break;
// r=r+s.charAt(i);
// }
// return r;
// }