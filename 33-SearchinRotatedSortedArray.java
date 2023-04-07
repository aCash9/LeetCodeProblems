class Solution {
    public int search(int[] n, int target) {
        int low, high, mid;
        low = 0;
        high = n.length - 1;
        while(low <= high){
            mid = (low + high)/2;
            if(n[mid] == target)
                return mid;
            //check whether the left part is sorted
            if(n[low] <= n[mid]){
                if(target >= n[low] && target <= n[mid])
                    high = mid -1;
                else 
                    low = mid + 1;
            } //right is sorted
            else {
                if(target >= n[mid] && target <= n[high])
                    low = mid + 1;
                else 
                    high = mid - 1;
            }
        }
        return -1;
    }
}
