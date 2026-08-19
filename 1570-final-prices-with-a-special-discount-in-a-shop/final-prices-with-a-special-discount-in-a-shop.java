import java.util.Stack;

class Solution {
    public int[] finalPrices(int[] prices) {

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < prices.length; i++) {

            while (!st.empty() && prices[st.peek()] >= prices[i]) {
                prices[st.pop()] -= prices[i];
            }

            st.push(i);
        }

        return prices;
    }
}