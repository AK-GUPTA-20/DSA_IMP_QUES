class Queue_LinkedList {

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node front; // Pointer to the front of the queue
    private Node rear;  // Pointer to the rear of the queue

    // Constructor to initialize the queue
    Queue_LinkedList() {
        this.front = null;
        this.rear = null;
    }

    // Enqueue an element into the queue
    public void add(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    // Dequeue an element from the queue
    public int remove() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }
        int data = front.data;
        front = front.next;

        // If the queue becomes empty, update rear to null
        if (front == null) {
            rear = null;
        }
        return data;
    }

    // Peek the front element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }
        return front.data;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return front == null;
    }

    // Display the elements in the queue
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        Node temp = front;
        System.out.print("Queue: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class QueueUsingLL {
    public static void main(String[] args) {
        Queue_LinkedList queue = new Queue_LinkedList();

        queue.add(10);
        queue.add(20);
        queue.add(30);

        queue.display();

        System.out.println("Removed: " + queue.remove());
        queue.display();

        System.out.println("Peek: " + queue.peek());
        queue.display();
    }
}
