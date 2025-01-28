class LinkedList {
    private static class Node1 {
        int data;
        Node1 next;

        Node1(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node1 head = null; // Initialize the head to null
    private int size = 0;      // Track the size of the LinkedList

    // Method to add an element
    public void add(int data) {
        Node1 newNode = new Node1(data);
        if (head == null) {
            head = newNode;
        } else {
            Node1 temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        size++;
    }

    // Method to insert an element at a particular index
    public void insertAt(int idx, int data) {
        if (idx < 0 || idx > size) {
            System.out.println("Invalid index");
            return;
        }
        Node1 newNode = new Node1(data);
        if (idx == 0) { // Insert at the head
            newNode.next = head;
            head = newNode;
        } else {
            Node1 temp = head;
            for (int i = 0; i < idx - 1; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
        size++;
    }

    // Method to remove an element
    public void remove() {
        if (head == null) {
            System.out.println("The list is empty. Nothing to remove.");
            return;
        }
        if (head.next == null) { // Only one element
            head = null;
        } else {
            Node1 temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }
        size--;
    }

    // Method to remove an element at a particular index
    public void removeAt(int idx) {
        if (idx < 0 || idx >= size) {
            System.out.println("Invalid index");
            return;
        }
        if (idx == 0) { // Remove the head
            head = head.next;
        } else {
            Node1 temp = head;
            for (int i = 0; i < idx - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
        size--;
    }

    // Method to display the LinkedList
    public void display() {
        if (head == null) {
            System.out.println("Empty Linked List");
            return;
        }
        Node1 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Method to calculate the size of the LinkedList
    public int size() {
        return size;
    }

    // Method to reverse the LinkedList
    public void reverse() {
        Node1 next = null;
        Node1 prev = null;
        Node1 curr = head;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
}



public class LinkedListImple {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();


        ll.add(4);
        ll.add(9);
        ll.add(20);
        ll.add(0);
        ll.display();

        // Remove elements
        ll.remove();
        ll.remove();
        ll.display();


        ll.insertAt(0, 5);
        ll.insertAt(2, 15);
        ll.insertAt(4, 25);
        ll.display();


        ll.removeAt(2);
        ll.display();


        System.out.println("Reversing Linked List:");
        ll.reverse();
        ll.display();

        System.out.println("Size = " + ll.size());
    }
}
