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
            return;
        }
        tail.next = newNode;
        tail = newNode;

    }

    public void printLL() {
        if (head == null) {
            System.out.println("LL is Empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");

    }

    public int SearchINLL(int target) {
        Node temp = head;
        for (int i = 0; i < size; i++) {
            if (temp.data == target) {

                return i;
            }
            temp = temp.next;
        }
        return -1;
    }

    public int helper(Node temp, int key) {
        if (temp == null) {
            return -1;
        }

        // kaam
        if (temp.data == key) {
            return 0;
        }
        int idx = helper(temp.next, key);
        if (idx != -1) {
            idx++;
        }
        return idx;
    }

    public int serachRecursive(int key) {

        return helper(head, key);
    }

    // Reverse a LL

    public void Reverse() {

        Node prev = null;
        Node curr = tail = head;
        Node Next = null;
        while (curr != null) {
            Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
        }

        head = prev;

    }

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();
        ll.add(3);
        ll.add(6);
        ll.add(1);
        ll.add(4);
        ll.add(5);
        ll.printLL();
        // System.out.println(ll.serachRecursive(1));
        ll.Reverse();
        ll.printLL();
    }
}