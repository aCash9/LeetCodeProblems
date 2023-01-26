package LeetCodeProgramsDSA;

public class Que27 {
    public int removeElement(int[] nums, int val) {
        int l = nums.length;
        if (l == 1 && nums[0] == val) {
            nums = null;
            return 0;
        } else if (l == 1 && nums[0] != val) {
            return 1;
        }
        if (l == 0) {
            return 0;
        }
        int last = l - 1;
        int counter = 0;
        for (int i = 0; i < l; i++) {
            if (nums[i] == val) {
                counter++;
            }
        }

        if (counter == l) {
            nums = null;
            return 0;
        }
        counter = 0;
        for (int i = 0; i < l; i++) {
            if (i > last)
                break;
            if (nums[i] == val) {
                counter++;
                if (nums[last] != val) {
                    int temp = nums[last];
                    nums[last] = nums[i];
                    nums[i] = temp;
                    last--;
                } else {
                    last--;
                    i--;
                }
            }
        }

        return l - counter ;
    }

    public static void main(String[] args) {
        Que27 obj = new Que27();
        int[] arr1 = { 0,1,2,2,3,0,4,2};
        int[] arr2 = { 3,2,2,3};
        int[] arr3 = { 4, 5 };
        // int k1 = obj.removeElement(arr1, 2);
        // int k2 = obj.removeElement(arr2, 3);
        int k3 = obj.removeElement(arr3, 5);
        // System.out.println(k1);
        // System.out.println(k2);
        System.out.println(k3);
        // for (int i = 0; i < k1; i++) {
        //     System.out.print(arr1[i]+",");
        //     }
        //     System.out.println();
        //     for (int i = 0; i < k2; i++) {
        //         System.out.print(arr2[i] + ",");
        //     }
            System.out.println();
        for (int i = 0; i < k3; i++) {
            System.out.print(arr3[i] + ",");
        }

    }
}


// System.out.println(k1);
// System.out.println(k2);

// System.out.println();
// for (int i = 0; i < k2; i++) {
// System.out.print(arr2[i]+",");
// }
