public class LinkedList {

    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void add(int data) {
        size++;
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        }

        tail.next = newNode;
        tail = newNode;

    }

    public void printLL() {

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();

    }

    public void deleteFromStart(int idx) {

        Node temp = head;
        System.out.println(head.data);
        for (int i = 0; i < idx - 1; i++) {

            temp = temp.next;
        }
        size--;
        temp.next = temp.next.next;

    }

    public void deleteFromEnd(int n) {

        // delete -> (size-n+1)th node

        int idx = size - n + 1;
        size--;
        if (n == size) {
            head = head.next;
            return;
        }

        Node temp = head;

        for (int i = 1; i < idx - 1; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;

    }

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();

        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.printLL();
        ll.deleteFromStart(2);
        ll.printLL();
        ll.deleteFromEnd(1);
        ll.printLL();
    }
}
