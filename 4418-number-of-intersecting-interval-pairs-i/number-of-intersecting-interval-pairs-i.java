class Solution {
    public int countIntersectingIntervals(int[][] intervals) {
        int count = 0;

        for (int i = 0; i < intervals.length; i++) {
            for (int j = i + 1; j < intervals.length; j++) {

                int st = intervals[i][0];
                int end = intervals[i][1];

                int st1 = intervals[j][0];
                int end1 = intervals[j][1];

                
                if (Math.max(st, st1) <= Math.min(end, end1)) {
                    count++;
                }
            }
        }

        return count;
    }
}