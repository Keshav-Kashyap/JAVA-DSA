import java.util.ArrayList;

public class LinkedList2 {

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
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();

    }

    public static boolean isPalindrome(ArrayList<Integer> list) {

        ArrayList<Integer> reversList = new ArrayList<>();

        for (int i = list.size() - 1; i >= 0; i--) {
            reversList.add(list.get(i));
        }

        for (int i = 0; i < list.size(); i++) {
            if (reversList.get(i) != list.get(i)) {
                return false;
            }
        }

        return true;
    }

    public boolean checkPalindromeLL() {

        Node temp = head;
        ArrayList<Integer> list = new ArrayList<>();

        while (temp != null) {
            list.add(temp.data);
            temp = temp.next;
        }

        return isPalindrome(list);

    }

    public static void main(String[] args) {

        LinkedList2 ll = new LinkedList2();
        ll.add(1);
        ll.add(2);
        ll.add(2);
        ll.add(4);

        ll.printLL();
        System.out.println(ll.checkPalindromeLL());
    }
}
