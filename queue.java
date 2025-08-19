package cse;
public class queue {
    private int front, rear, capacity;
    private int[] queue;
    public queue(int size) {
        front = rear = 0;
        capacity = size;
        queue = new int[capacity];
    }
    public void enqueue(int item) {
        if (rear == capacity) {
            System.out.println("Queue is full");
            return;
        }
        queue[rear] = item;
        rear++;
    }
    public void dequeue() {
        if (front == rear) {
            System.out.println("Queue is empty");
            return;
        }
        for (int i = 0; i < rear - 1; i++) {
            queue[i] = queue[i + 1];
        }
        rear--;
    }
    public void display() {
        if (front == rear) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = front; i < rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
    public void front() {
        if (front == rear) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Front element is: " + queue[front]);
    }
    public static void main(String[] args) {
        queue q = new queue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.display();
        q.dequeue();
        q.display();
        q.front();
    }
}

