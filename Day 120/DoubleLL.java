public class DoubleLL {

    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addLast(int data) {

        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.prev = tail;
        tail.next = newNode;
        tail = newNode;

    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;

    }

    public void deleteFirst() {

        if (head == null) {
            System.out.println("LL is empty");
            return;
        }

        size--;
        if (head.next == null) {
            head = tail = null;
            return;
        }

        head = head.next;
        head.prev = null;

    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        size--;
        if (head.next == null) {
            head = tail = null;
            return;
        }

        tail = tail.prev;
        tail.next = null;

    }

    public void printLL() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void reverseDll() {
        if (head == null) {
            System.out.println("LL is empty");
            return;

        }

        Node curr = head;
        Node prev = null;
        Node next = null;

        while (curr != null) {

            next = curr.next;
            curr.next = prev;
            curr.prev = next;

            // update
            prev = curr;
            curr = next;

        }
        head = prev;

    }

    public static void main(String[] args) {
        DoubleLL dll = new DoubleLL();
        dll.addFirst(1);
        dll.addFirst(2);
        dll.addFirst(3);
        dll.addFirst(4);
        dll.addFirst(5);

        dll.addLast(10);
        // dll.printLL();
        // dll.deleteFirst();
        // dll.printLL();
        // dll.deleteLast();
        dll.printLL();
        dll.reverseDll();
        dll.printLL();

    }

}
