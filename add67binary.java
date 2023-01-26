package LeetCodeProgramsDSA;

public class add67binary {
    public static String addBinary(String a, String b) {
        char[] num1 = a.toCharArray();
        char[] num2 = b.toCharArray();

        int length = 0, l;
        if (num1.length > num2.length) {
            length = num2.length;
            l = 2;
        } else {
            length = num2.length;
            l = 1;
        }

        String str = null;
        for (int i = 0; i < length; i++) {
            if(num1[i] == 1 && num2[i] == 1)
            str = "10";
        }
return str;
    }

    public static void main(String[] args) {
        String str = addBinary("1", "11");
        System.out.println(str);
    }
}
