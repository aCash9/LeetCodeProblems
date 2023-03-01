class Solution {
    public boolean canPlaceFlowers(int[] fb, int n) {
        int free = 0;
        int right = 0; 
        for(int i = 0; i < fb.length - 1; i++){
            if(fb[i] == 0){
                if(right == 0 && fb[i+1] == 0){
                    free++;
                } else {
                    right = 0;
                    continue;
                }
            }
            right = 1;
        }
        if(right == 0 && fb[fb.length - 1] == 0)
            free++;
        
        if(free >= n)
            return true;
        else    
            return false;
    }
}
