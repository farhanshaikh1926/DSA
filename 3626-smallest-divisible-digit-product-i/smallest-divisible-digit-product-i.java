class Solution {
    public int smallestNumber(int n, int t) {
        while (true) {
            int count = 1;
            int temp = n;

            while (temp > 0) {
                int rem = temp % 10;
                count *= rem;
                temp /= 10;
            }
            if (count % t == 0) {
                return n;
            }
            n++;
        }
    }
}