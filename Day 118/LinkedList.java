public class LinkedList {

    class Node {
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
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }

        Node temp = head;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }

    }

    public boolean checkCircle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;

    }

    public boolean removeCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                slow = head;
                break;

            }
        }

        Node prev = fast;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next;

            if (slow == fast) {
                prev.next = null;
            }
            prev = prev.next;
        }

        return false;

    }

    public void makeCycle() {

        Node temp = head;

        Node circ = head;

        while (circ.data != 3) {
            circ = circ.next;
        }

        while (temp.next != null) {

            temp = temp.next;
        }

        temp.next = circ.next;

    }

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();
        ll.add(1);
        ll.add(4);
        ll.add(3);
        ll.add(5);
        ll.add(2);
        ll.printLL();

        ll.makeCycle();
        System.out.println();
        System.out.println();
        System.out.println();

        if (ll.checkCircle()) {
            ll.removeCycle();
        }
        ll.printLL();
    }
}