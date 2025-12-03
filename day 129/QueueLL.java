public class QueueLL {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class Queue {
        static Node head = null;
        static Node tail = null;
        static int size;

        public boolean isEmpty() {
            return head == null;
        }

        void enqueue(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = tail = newNode;
                return;
            }

            // add in the rare means in the tail basic he karna hai bhai kuch new nhi hai

            tail.next = newNode;
            tail = newNode;

        }

        public int dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            int val = head.data;

            if (head == tail) {
                tail = head = null;
            } else {
                head = head.next;
            }
            return val;

        }

        public int peek() {
            return head.data;
        }

    }

    public static void main(String[] args) {

        Queue q = new Queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.dequeue();
        }

    }
}