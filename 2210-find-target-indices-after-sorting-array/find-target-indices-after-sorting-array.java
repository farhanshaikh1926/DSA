class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                st.push(i);
            }
        }
        return st;
    }
}