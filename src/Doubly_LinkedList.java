class DoublyLinkedList {

    private static class Node2 {
        int data;
        Node2 next;
        Node2 prev;

        Node2(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    private Node2 head = null; // Head of the list
    private Node2 tail = null; // Tail of the list
    private int size = 0;      // Track the size of the list

    // Add an element to the end
    public void add(int data) {
        Node2 newNode = new Node2(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    // Insert an element at a specific index
    public void insertAt(int idx, int data) {
        if (idx < 0 || idx > size) {
            System.out.println("Invalid index");
            return;
        }
        Node2 newNode = new Node2(data);
        if (idx == 0) { // Insert at the head
            newNode.next = head;
            if (head != null) head.prev = newNode;
            head = newNode;
            if (tail == null) tail = newNode;
        } else if (idx == size) { // Insert at the tail
            add(data);
            return;
        } else { // Insert in the middle
            Node2 temp = head;
            for (int i = 0; i < idx - 1; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            newNode.prev = temp;
            temp.next.prev = newNode;
            temp.next = newNode;
        }
        size++;
    }

    // Remove an element from the end
    public void remove() {
        if (tail == null) {
            System.out.println("The list is empty. Nothing to remove.");
            return;
        }
        if (head == tail) { // Single element in the list
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
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
            head = head.next;
            if (head != null) head.prev = null;
            if (head == null) tail = null;
        } else if (idx == size - 1) { // Remove tail
            remove();
            return;
        } else { // Remove from the middle
            Node2 temp = head;
            for (int i = 0; i < idx; i++) {
                temp = temp.next;
            }
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }
        size--;
    }

    // Display the list
    public void display() {
        Node2 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Get the size of the list
    public int size() {
        return size;
    }

    // Reverse the doubly linked list
    public void reverse() {
        Node2 current = head;
        Node2 temp = null;

        // Swap next and prev pointers for all nodes
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }

        // Update the head and tail pointers
        if (temp != null) {
            head = temp.prev;
        }
    }
}



public class Doubly_LinkedList {
    public static void main(String[] args) {
        DoublyLinkedList lst = new DoublyLinkedList();
        lst.add(4);
        lst.add(8);
        lst.add(2);
        lst.insertAt(1, 9);
        lst.add(1);
        System.out.println("Original List:");
        lst.display();

        lst.reverse();
        System.out.println("Reversed List:");
        lst.display();
    }
}

