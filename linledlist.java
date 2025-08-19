package cse;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
 class linkedlist {
    private Node top;
    public linkedlist() {
        top = null;
    }
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Cannot pop.");
            return -1;
        }
        int poppedData = top.data;
        top = top.next;
        return poppedData;
    }
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return top.data;
    }
    public boolean isEmpty() {
        return top == null;
    }
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Stack elements (top to bottom): ");
        Node current = top;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        linkedlist stack = new linkedlist();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();
        System.out.println("Top element is: " + stack.peek());

        System.out.println("Popped element: " + stack.pop());

        stack.display();

        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}

