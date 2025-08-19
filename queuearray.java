package cse;
public class queuearray {
    private int[] queue;
    private int front, rear, capacity;
    public queuearray(int size) {
        capacity = size;
        queue = new int[capacity];
        front = 0;
        rear = 0;
    }
    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue Overflow - Cannot enqueue " + item);
            return;
        }
        queue[rear++] = item;
        System.out.println("Enqueued: " + item);
    }
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow - Cannot dequeue");
            return -1;
        }
        int item = queue[front];
        for (int i = 0; i < rear - 1; i++) {
            queue[i] = queue[i + 1];
        }
        rear--;
        System.out.println("Dequeued: " + item);
        return item;
    }
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty - Cannot peek");
            return -1;
        }
        return queue[front];
    }
    public boolean isEmpty() {
        return rear == front;
    }
    public boolean isFull() {
        return rear == capacity;
    }
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = front; i < rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        queuearray queue = new queuearray(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display();
        queue.dequeue();
        queue.display();
        System.out.println("Front element: " + queue.peek());
    }
}

