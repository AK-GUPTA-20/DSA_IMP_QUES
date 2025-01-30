import java.util.*;

public class DoubleEndedQueue {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        // Adding elements at both ends
        deque.addFirst(1);
        deque.addLast(2);
        deque.addFirst(3);
        deque.addLast(4);

        System.out.println("Deque: " + deque);

        System.out.println("Removed from front: " + deque.removeFirst());
        System.out.println("Removed from rear: " + deque.removeLast());

        System.out.println("Deque after removals: " + deque);

        System.out.println("Front element: " + deque.peekFirst());
        System.out.println("Rear element: " + deque.peekLast());

        System.out.println("Is deque empty? " + deque.isEmpty());
    }
}
