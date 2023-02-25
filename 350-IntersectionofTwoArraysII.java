class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
       HashMap<Integer,Integer> map1 = new HashMap<>(); 
       HashMap<Integer,Integer> map2 = new HashMap<>(); 

       for(int i = 0; i < nums1.length; i++){
           map1.put(nums1[i], map1.getOrDefault(nums1[i], 0) + 1);
       }

       for(int i = 0; i < nums2.length; i++){
           map2.put(nums2[i], map2.getOrDefault(nums2[i], 0) + 1);
       }
        List<Integer> list = new LinkedList<>();
       for (Map.Entry<Integer, Integer> e : map1.entrySet()) {
           int key = e.getKey();
           int freq = 0;
           if(map2.containsKey(key)){
               freq = Math.min(e.getValue(), map2.get(key));
                for(int i = 0; i < freq; i++)
                    list.add(key);
           }
        }
        int[] array = list.stream().mapToInt(i -> i).toArray();
        return array;
    }
}
// better solution
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
       Arrays.sort(nums1);
       Arrays.sort(nums2);
       int i = 0 , j = 0, k = 0;
       while(i < nums1.length && j < nums2.length){
            if(nums1[i] < nums2[j])
                i++;
            else if(nums1[i] > nums2[j])
                j++;
            else {
                nums1[k++] = nums1[i++];
                j++;
            } 
       }
       return Arrays.copyOfRange(nums1, 0, k);
    }
}
