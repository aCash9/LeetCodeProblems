class Solution {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        int[] nextgr = new int[nums1.length];
        Arrays.fill(nextgr, -1);

        for (int i = 0; i < nums2.length; i++) {
            while (!stack.isEmpty() && nums2[stack.peek()] < nums2[i])
                map.put(nums2[stack.pop()], nums2[i]);
            stack.push(i);
        }
        int i = 0;
        for (int num : nums1) {
            if (map.containsKey(num)) {
                int gr = map.get(num);
                nextgr[i] = gr;
            }
            i++;
        }

        return nextgr;
    }
}
