public class QueueLL {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }


    static class Queue {
        Node head = null;
        Node tail = null;

 
        public void push(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        // pop → remove first element
        public int pop() {
            if (head == null) {
                System.out.println("Queue is empty!");
                return -1;
            }
            int front = head.data;
            head = head.next;

            if (head == null)
                tail = null;

            return front;
        }

        // peek → see first element
        public int peek() {
            if (head == null) {
                System.out.println("Queue is empty!");
                return -1;
            }
            return head.data;
        }

        // check if empty
        public boolean isEmpty() {
            return head == null;
        }
    }

    // main to test
    public static void main(String[] args) {
        Queue q = new Queue();

        q.push(10);
        q.push(20);
        q.push(30);

        System.out.println("Peek: " + q.peek());
        System.out.println("Pop: " + q.pop());
        System.out.println("Pop: " + q.pop());
        System.out.println("Peek: " + q.peek());

        System.out.println("Empty? " + q.isEmpty());
    }
}
