class Solution {
    public int countConsistent(int[] nums) {
        int n = nums.length, ans = 0;

        for (int i = 0; i < n; i++) {
            int minVal = Integer.MAX_VALUE;
            int temp = -1;

            for (int j = i; j < n; j++) {
                minVal = Math.min(minVal, nums[j]);
                temp = temp & nums[j];

                if (minVal == temp)
                    ans++;
            }
        }
        return ans;
    }
}