import java.util.Stack;

class QueueUsingStacks {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    // Enqueue (Push) Operation - O(1)
    void enqueue(int data) {
        s1.push(data);
    }

    // Dequeue (Pop) Operation - O(n)
    int dequeue() {
        if (s1.isEmpty() && s2.isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }

        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }

        return s2.pop();
    }

    // Peek (Front element) - O(n)
    int peek() {
        if (s1.isEmpty() && s2.isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }

        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }

        return s2.peek();
    }

    // Check if queue is empty
    boolean isEmpty() {
        return s1.isEmpty() && s2.isEmpty();
    }
}

public class QueueUsing2Stack{
    public static void main(String[] args) {
        QueueUsingStacks queue = new QueueUsingStacks();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        System.out.println("Front element in queue = " + queue.peek());
        System.out.println(queue.dequeue() + " is removed from the queue");
        System.out.println("Front element in queue = " + queue.peek());

        System.out.println("Queue Elements: ");
        while (!queue.isEmpty()) {
            System.out.print(queue.dequeue());
        }
    }
}
