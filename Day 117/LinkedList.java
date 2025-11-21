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
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;

    }

    public void printLL() {
        if (head == null) {
            System.out.println("Empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }

    }

    public Node findMid(Node head) {

        Node slow = head;
        Node fast = head;

        // even case

        while (fast != null && fast.next != null) {
            slow = slow.next;// +1
            fast = fast.next.next;// +2
        }

        return slow;

    }

    public boolean isPalindrome() {

        if (head == null || head.next == null) {
            return true;
        }
        // step-1 finding mid
        Node midNode = findMid(head);
        // step-2 reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev; // right half head
        Node left = head;// left half head

        // step 3 check left half == right half

        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;
    }

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();
        ll.add(1);
        ll.add(2);
        ll.add(2);
        ll.add(1);

        ll.printLL();
        System.out.println(ll.isPalindrome());

    }
}
