import java.util.Deque;
import java.util.LinkedList;

public class QueueDQ {

    static class Queue {

        Deque<Integer> dq = new LinkedList<>();

        public void add(int data) {
            dq.addLast(data);
        }

        public int remove() {
            return dq.removeFirst();
        }

        public int peek() {
            return dq.getFirst();
        }

        public boolean isEmpty() {
            return dq.isEmpty();
        }

    }

    public static void main(String[] args) {

        Queue q = new Queue();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while (!q.isEmpty()) {

            System.out.println(q.peek());
            q.remove();

        }

    }
}