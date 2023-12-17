class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for(String str: strs) {
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            if(map.containsKey(Arrays.toString(arr))) {
                map.get(Arrays.toString(arr)).add(str);
            } else {
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(Arrays.toString(arr), list);
            }
        }
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            ans.add(entry.getValue());
        }
        return ans;
    }
}
