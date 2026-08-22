class Solution {
    public boolean checkDivisibility(int n) {
        int org = n;
        int prod = 1;
        int count = 0;

        while (n > 0) {
            int rem = n % 10;
            count += rem;
            prod *= rem;
            n /= 10;
        }

        int result = count + prod;

        return result != 0 && org % result == 0;
    }
}