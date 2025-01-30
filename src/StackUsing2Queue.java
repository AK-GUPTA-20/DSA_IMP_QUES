import java.util.*;
import java.util.LinkedList;

class stack{
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    // Method to push an Element
    void push(int data) {
        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }
        q1.add(data);

        while (!q2.isEmpty()) {
            q1.add(q2.remove());
        }
    }

    // method to remove an element
    int pop() {
        if (q1.isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return q1.remove();
    }


    int peek() {
        if (q1.isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return q1.peek();
    }

    boolean isEmpty(){
        return q1.isEmpty();
    }

}
public class StackUsing2Queue {
    public static void main(String[] args) {
        stack st = new stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println("Top element in stack = "+st.peek());
        System.out.println((st.pop()+" is removed from your stack"));
        System.out.println("Top element in stack = "+st.peek());
        System.out.print("Stack Element:   ");
        while(!st.isEmpty()){
            System.out.println(st.pop()+" ");
            System.out.print("                 ");

        }

    }

}
