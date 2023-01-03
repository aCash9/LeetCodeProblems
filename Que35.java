package LeetCodeProgramsDSA;

public class Que35 {
    public int searchInsert(int[] nums, int target) {
        int mid = 0;
        int max = nums.length - 1, min = 0;

        while (min <= max) {
            mid = (max + min) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] > target) {
                max = mid - 1;
            }
            if (nums[mid] < target) {
                min = mid + 1;
            }
        }
        return min;
        // if(nums[mid]>target)
        //     return mid;
        // else
        //     return mid+1;
    }
    
    public static void main(String[] args) {
        Que35 obj = new Que35();
        int[] arr = {1,3,5,6};
        int index = obj.searchInsert(arr, 2);
        System.out.println(index);
    }
}
