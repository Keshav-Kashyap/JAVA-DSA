public class LinkedList {

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
    public static int size;

    public void addFirst(int data) {
        size++;
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;

    }

    public void printLL() {
        Node tempHead = head;

        if (tempHead == null) {
            System.out.println("LinkedList Empty");
        }

        while (tempHead != null) {
            System.out.println(tempHead.data);
            tempHead = tempHead.next;

        }
    }

    // add Middle
    public void addMiddle(int idx, int data) {
        size++;
        Node newNode = new Node(data);

        // node at idx-1->next = newNode
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }

    public void DeleteFirst() {

        if (size == 0) {
            System.out.println("LL is empty");
            return;
        } else if (size == 1) {
            head = tail = null;
            size--;
            return;
        }
        size--;
        head = head.next;

    }

    public void deleteLast() {
        if (size == 0) {
            System.out.println("LL is empty");
            return;
        } else if (size == 1) {
            head = tail = null;
            size--;
            return;
        }
        size--;

        // prev -> i = size-2;
        Node prev = head;
        int i = 0;
        while (i != size - 1) {
            i++;
            prev = prev.next;
        }
        prev.next = null;
        tail = prev;

    }

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();

        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);

        // addMiddle
        ll.addMiddle(1, 10);
        ll.printLL();
        System.out.println("Size Before Delete" + size);
        ll.DeleteFirst();
        ll.printLL();
        System.out.println("Size after Deleting" + size);
        ll.deleteLast();
        System.out.println("Size after Deleting" + size);
        ll.printLL();
    }

}