class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int mid = nums[nums.length / 2];
        long moves = 0;
        for(int i = 0;i<nums.length;i++){
            moves += Math.abs(nums[i] - mid);
        }
        return (int) moves;
    }
}