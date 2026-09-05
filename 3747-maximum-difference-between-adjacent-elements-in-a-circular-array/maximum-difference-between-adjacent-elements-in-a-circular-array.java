class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            int next = (i + 1) % nums.length;
            int sum = Math.abs(nums[i] - nums[next]);

            max = Math.max(max, sum);
        }

        return max;
    }
}