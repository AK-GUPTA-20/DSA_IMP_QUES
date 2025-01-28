class Queue_Array {
    private final int[] Queue;
    private final int size;
    private int rear = -1;
    private final int front = 0;

    // Constructor to initialize the queue with a specific size
    Queue_Array(int size) {
        this.size = size;
        Queue = new int[size];
    }

    // Enqueue an element into the queue
    public void add(int data) {
        if (isFull()) {
            System.out.println("Queue Overflow");
            return;
        }
        Queue[++rear] = data;
    }

    // Dequeue an element from the queue
    public int remove() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }
        int top = Queue[front];
        for (int i = 0; i < rear; i++) {
            Queue[i] = Queue[i + 1];
        }
        rear--;
        return top;
    }

    // Peek the front element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }
        return Queue[front];
    }

    // Check if the queue is full
    public boolean isFull() {
        return rear == size - 1;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return rear < front;
    }

    // Display the elements in the queue
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(Queue[i] + " ");
        }
        System.out.println();
    }
}

public class QueueUsingArray {
    public static void main(String[] args) {
        Queue_Array QueArr = new Queue_Array(5);
        QueArr.add(10);
        QueArr.add(20);
        QueArr.add(30);

        QueArr.display();

        System.out.println("Removed: " + QueArr.remove());
        QueArr.display();

        System.out.println("Peek: " + QueArr.peek());
        QueArr.display();
    }
}
