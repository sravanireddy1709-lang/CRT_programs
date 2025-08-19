package cse;
import java.util.LinkedList;
import java.util.Queue;
public class queuelinked {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        System.out.println("Queue after enqueue: " + queue);
        int removed = queue.poll(); 
        System.out.println("Dequeued element: " + removed);
        System.out.println("Queue after dequeue: " + queue);
        int front = queue.peek();
        System.out.println("Front element: " + front);
        System.out.println("Is queue empty? " + queue.isEmpty());
    }
}

