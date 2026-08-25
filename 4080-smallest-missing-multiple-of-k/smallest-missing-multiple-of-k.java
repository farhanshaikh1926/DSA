class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> s = new HashSet<>();
        for (int num : nums) {
            s.add(num);
        }

        int cur = k;
        while (s.contains(cur)) {
            cur += k;
        }

        return cur;
    }
}