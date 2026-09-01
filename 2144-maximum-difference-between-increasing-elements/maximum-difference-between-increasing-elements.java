class Solution {
    public int maximumDifference(int[] nums) {
        int count = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<nums.length;i++){
            for(int j = i + 1;j<nums.length;j++){
                if(nums[j] > nums[i]) {
                    count = nums[j] - nums[i];
                    max = Math.max(count,max);
                }
               
            }
        }
        return (max ==  Integer.MIN_VALUE) ||( max < 0) ? -1 : max;
    }
}