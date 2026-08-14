import java.util.Stack;

class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < operations.length; i++) {

            if (operations[i].equals("C")) {
                st.pop();
            }

            else if (operations[i].equals("D")) {
                int x = st.peek();
                st.push(x * 2);
            }

            else if (operations[i].equals("+")) {
                int first = st.pop();
                int second = st.peek();

                st.push(first);
                st.push(first + second);
            }

            else {
                int num = Integer.parseInt(operations[i]);
                st.push(num);
            }
        }

        int sum = 0;

        while (!st.isEmpty()) {
            sum += st.pop();
        }

        return sum;
    }
}