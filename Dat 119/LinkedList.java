
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

    public Node findMid(Node head) {

        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }

    public Node mergeSort(Node head) {

        if (head == null || head.next == null) {
            return head;
        }

        Node mid = findMid(head);
        // finding the right head
        Node rightHead = mid.next;
        // make left head by mid.next = null
        mid.next = null;
        // call for left head to mid
        Node newLeft = mergeSort(head);
        // call for right head right to end
        Node newRight = mergeSort(rightHead);

        return merge(newLeft, newRight);

    }

    public Node merge(Node leftHead, Node rightHead) {
        Node mergerLL = new Node(-1);
        Node temp = mergerLL;

        while (leftHead != null && rightHead != null) {

            if (leftHead.data <= rightHead.data) {
                temp.next = leftHead;
                leftHead = leftHead.next;
                temp = temp.next;
            } else {
                temp.next = rightHead;
                rightHead = rightHead.next;
                temp = temp.next;
            }
        }

        while (leftHead != null) {
            temp.next = leftHead;
            leftHead = leftHead.next;
            temp = temp.next;

        }
        while (rightHead != null) {
            temp.next = rightHead;
            rightHead = rightHead.next;
            temp = temp.next;

        }

        return mergerLL.next;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(1);
        ll.add(5);
        ll.add(4);
        ll.add(2);
        ll.printLL();
        System.out.println();
        System.out.println();
        System.out.println();
        ll.mergeSort(head);
        ll.printLL();
    }
}
