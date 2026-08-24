class Solution {
    public int findClosest(int x, int y, int z) {
        int ans = Math.abs(x - z);
        int ans2 = Math.abs(y - z);
        if(ans == ans2){
            return 0;
        }
        else if(ans < ans2){
            return 1;
        }
        else{
            return 2;
        }
       
    }
}