package LeetCodeProgramsDSA;

public class Que66 {
    public int[] plusOne(int[] digits) {
        int l = digits.length;
        for (int i = l - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
                continue;
            } else {
                digits[i] += 1;
                return digits;
            }
        }
        int[] newDigits = new int[l + 1];
        newDigits[0] = 1;
        return newDigits;
    }

    

    public static void main(String[] args) {
        Que66 obj = new Que66();
        int arr[] = { 9 };
        int a[] = obj.plusOne(arr);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
