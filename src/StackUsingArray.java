class Stack_Array {
    private final int[] stack;
    private int top;
    private final int capacity;

    // Constructor to initialize the stack
    public Stack_Array(int size) {
        stack = new int[size];
        capacity = size;
        top = -1;
    }

    // Push an element onto the stack
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = value;
    }

    // Pop an element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack[top--];
    }

    // Peek at the top element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return stack[top];
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Check if the stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }

    // Get the size of the stack
    public int size() {
        return top + 1;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

}

public class StackUsingArray {
    public static void main(String[] args) {
        Stack_Array stl = new Stack_Array(5);
        stl.push(30);
        stl.push(40);
        stl.push(50);
        stl.push(10);
        System.out.print("Elements = ");
        stl.display();
        System.out.println("Top element: " + stl.peek());
        System.out.println("Popped: " + stl.pop());
        System.out.println("Is Empty: " + stl.isEmpty());
        System.out.println("size: " + stl.size());
        System.out.print("Elements = ");
        stl.display();
    }
}
