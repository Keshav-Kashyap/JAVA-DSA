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

    public void deleteByIndex(int idx) {

        Node tempPrev = null;
        Node tempNext = head;
        for (int i = 0; i < idx; i++) {
            if (tempPrev == null) {
                tempPrev = head;
                tempNext = tempNext.next;
                break;
            }
            tempPrev = tempPrev.next;
            tempNext = tempNext.next;
        }
        tempPrev.next = tempNext.next;

    }

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();

        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.printLL();
        ll.deleteByIndex(2);
        ll.printLL();

    }
}