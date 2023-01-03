package LeetCodeProgramsDSA;

import JavaRecursionPrograms.RemoveDuplicates;

public class Que26 {
    public int removeDuplicates(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length ; i++) {
            
            if (nums[i] == nums[i + 1]) {
                count++;
                nums[i + 1] = nums[i + 2];
            }
        }
        count = nums.length - count;
        return count;
    }

    public static void main(String[] args) {
        Que26 obj = new Que26();
        int[] nums = { 1, 1, 2, 3, 3, 3 };
        System.out.println(obj.removeDuplicates(nums));
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ",");
        }
    }
}
