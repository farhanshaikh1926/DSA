import java.util.*;

class MyStack {
    Queue<Integer> q = new LinkedList<>();
    Queue<Integer> q1 = new LinkedList<>();

    public MyStack() {
        
    }

    public void push(int x) {
        q1.offer(x);

        while (!q.isEmpty()) {
            q1.offer(q.poll());
        }

        Queue<Integer> temp = q;
        q = q1;
        q1 = temp;
    }

    public int pop() {
        return q.poll();
    }

    public int top() {
        return q.peek();
    }

    public boolean empty() {
        return q.isEmpty();
    }
}