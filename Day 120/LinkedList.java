
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
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void zigZag() {

        Node tempLast = head;
        while (tempLast != null) {
            tempLast = tempLast.next;
        }

        Node tempHead = head;

        Node storeTemp = null;

        while (tempLast != tempHead) {

            storeTemp = tempHead;
            tempHead.next = tempLast;
            tempLast = storeTemp.next;

            tempHead = storeTemp.next;

        }

    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.printLL();

        ll.zigZag();

        ll.printLL();

    }
}
