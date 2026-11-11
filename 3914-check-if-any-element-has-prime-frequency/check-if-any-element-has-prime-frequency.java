import java.util.Arrays;

class Solution {
    public boolean checkPrimeFrequency(int[] nums) {

        Arrays.sort(nums);

        int count = 1;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] == nums[i - 1]) {
                count++;
            } 
            else {
                if (isPrime(count)) {
                    return true;
                }
                count = 1;
            }
        }

        if (isPrime(count)) {
            return true;
        }

        return false;
    }

    public boolean isPrime(int n) {

        if (n < 2) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}