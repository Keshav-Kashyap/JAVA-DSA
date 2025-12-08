import java.util.*;


public class StackDQ{

    public class Stack{

        Deque <Integer> dq = LinkedList<>();
       
        public void push(int data){
            dq.addLast(data);
        }

        public int pop(){
           return dq.removeLast();
        }

        public int peek(){
         return dq.getLast();
        }

public void isEmpty(){
return dq.isEmpty();

}



    }




    public static void main(String[]args){

Stack s = new Stack();
s.push(1);
s.push(2);
s.push(3);
s.push(4);
s.push(5);

while(!s.isEmpty()){
    System.out.println(s.peek());
    s.pop()
}



    }


}