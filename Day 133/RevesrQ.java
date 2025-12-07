import java.util.*;

public class RevesrQ {

    public static void reverseQ(Queue<Integer> q) {
        Stack<Integer> s = new Stack<>();
        while (!q.isEmpty()) {

            s.push(q.remove());
        }

        // now push back to q

        while (!s.isEmpty()) {
            q.add(s.pop());
        }

    }

    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        reverseQ(q);
        System.out.println(q);
    }

}