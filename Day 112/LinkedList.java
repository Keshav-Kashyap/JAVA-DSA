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

    public void addFirst(int data) {
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
    public void addMiddle(int idx, int data){

        Node newNode = new Node(data);
     

         // node at idx-1->next = newNode
         Node temp = head;
         int i = 0;
         while(i<idx-1){
            temp=temp.next;
            i++;
         }
        newNode.next = temp.next;
temp.next=newNode; 

    }

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();

        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);

        // addMiddle
        ll.addMiddle(1,10);
        ll.printLL();

    }

}