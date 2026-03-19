import java.util.Queue;
import java.util.LinkedList;

// Part of Java Collection Framework
// Follows FIFO principle
// offer - to insert element, returns false if queue is full
// poll - to remove element, returns null if queue is empty
// remove - to remove element, throws exception if queue is empty
// peek - to retrieve head of the queue, returns null if queue is empty
// add - to insert element, throws exception if queue is full
// clear - to remove all elements from the queue
// contains - to check if element exists, returns true or false
// empty - to check if queue is empty, returns true or false
// containers - to get the number of elements in the queue
// Linked List is used for fast insertion and removal of elements in Queue

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(1);
        queue.add(2);
        queue.add(3);

        System.out.println("Queue: " + queue);
        
        System.out.println("Peek: " + queue.peek());

        System.out.println("Poll: " + queue.poll());
        System.out.println("Queue after poll: " + queue);
        
        queue.remove();
        System.out.println("Queue after remove: " + queue);

        queue.offer(4);
        System.out.println("Queue after offer: " + queue);

        System.out.println("Size of Queue: " + queue.size());
    }
}
