class Solution {
    public static int maxArea(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n - 1;
        int maxArea = 0;
        while (left < right) {
            int currentArea = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea, currentArea);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}

// other approach
class Solution {
    public int maxArea(int[] height) {
        int area = 0;
		int i = 0;
		int j = height.length-1;
		while(i < j) {
			int heightVar = (height[i] > height[j] ? height[j] : height[i]);
			int areaVar = heightVar * (j - i);
			if (areaVar > area)
				area = areaVar;
			while(height[i]<=heightVar && i < j) i++;
			while(height[j]<=heightVar && i < j) j--;
		}
		return area;
    }
}
