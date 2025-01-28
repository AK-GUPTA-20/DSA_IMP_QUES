class CircularLinkedList {

    // making of class node as Node3
    private static class Node3 {
        int data;
        Node3 next;

        Node3(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node3 head = null;
    private Node3 tail = null;
    private int size = 0;

    // Add an element to the circular list
    public void add(int data) {
        Node3 newNode = new Node3(data);
        if (head == null) {
            head = tail = newNode;
            tail.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
        size++;
    }

    // Insert an element at a specific index
    public void insertAt(int idx, int data) {
        if (idx < 0 || idx > size) {
            System.out.println("Invalid index");
            return;
        }
        Node3 newNode = new Node3(data);
        if (idx == 0) { // Insert at the head
            if (head == null) {
                head = tail = newNode;
                tail.next = head;
            } else {
                newNode.next = head;
                head = newNode;
                tail.next = head;
            }
        } else {
            Node3 temp = head;
            for (int i = 0; i < idx - 1; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
            if (temp == tail) tail = newNode;
        }
        size++;
    }

    // Remove an element from the end
    public void remove() {
        if (head == null) {
            System.out.println("The list is empty. Nothing to remove.");
            return;
        }
        if (head == tail) { // Single element in the list
            head = tail = null;
        } else {
            Node3 temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = head;
            tail = temp;
        }
        size--;
    }

    // Remove an element at a specific index
    public void removeAt(int idx) {
        if (idx < 0 || idx >= size) {
            System.out.println("Invalid index");
            return;
        }
        if (idx == 0) { // Remove head
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
                tail.next = head;
            }
        } else {
            Node3 temp = head;
            for (int i = 0; i < idx - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == head) tail = temp;
        }
        size--;
    }

    // Reverse the circular linked list
    public void reverse() {
        if (head == null || head == tail) { // Empty list or single element
            return;
        }
        Node3 prev = tail;
        Node3 current = head;
        Node3 next;
        do {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        } while (current != head);
        // Swap head and tail
        tail = head;
        head = prev;
        tail.next = head;
    }

    // Display the circular list
    public void display() {
        if (head == null) {
            System.out.println("Empty Circular List");
            return;
        }
        Node3 temp = head;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to head)");
    }

    // Get the size of the list
    public int size() {
        return size;
    }
}


public class Circular_LinkedList {
    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        cll.add(1);
        cll.add(2);
        cll.add(3);
        cll.add(4);
        cll.add(5);

        cll.insertAt(3,7);
        cll.remove();
        cll.add(10);
        cll.removeAt(2);

        cll.display();

        System.out.println("Original Circular Linked List:");
        cll.display();


        System.out.println("Reversing Circular Linked List:");
        cll.reverse();
        cll.display();
    }
}

