class Stack_LinkedList {
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    private Node top = null;


    // Push an element onto the stack
    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }

    // Pop an element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int poppedValue = top.data;
        top = top.next;
        return poppedValue;
    }

    // Peek at the top element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return top.data;
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    // Get the size of the stack
    public int size() {
        int count = 0;
        Node temp = top;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    // display the stack
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

}


public class StackUsingLL {
    public static void main(String[] args) {
        Stack_LinkedList stl = new Stack_LinkedList();
        stl.push(30);
        stl.push(40);
        stl.push(50);
        stl.push(10);
        System.out.println("Top element: " + stl.peek());
        System.out.println("Popped: " + stl.pop());
        System.out.println("Is Empty: " + stl.isEmpty());
        System.out.println("size: " + stl.size());
        System.out.print("Elements = ");
        stl.display();
    }
}
