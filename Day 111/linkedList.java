public class LinkedList {

    // creating a class
    // data and next-> it store the another obj(node type )

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    // methods
    // add in linkedlist
    // add First and Add Last

    // add First
    // create a newNode
    // newNode next->head
    // head->newNode

    public void addFirst(int data) {

        // constant time O(1)
        // create a newNode
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // newNode.next->head
        newNode.next = head;
        // head->newNode
        head = newNode;

    }

    // add last
    public void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = tail;
        tail = newNode;

    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);

       ll.printLL();
    }
}