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
        System.out.print("null");

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

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();
        ll.add(3);
        ll.add(6);
        ll.add(1);
        ll.add(4);
        ll.add(5);
        ll.printLL();
        System.out.println(ll.SearchINLL(1));
        System.out.println(ll.SearchINLL(10));

    }
}