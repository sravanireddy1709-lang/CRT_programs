package cse;
public class stacklinked {
    private static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    private Node top;
    public stacklinked() {
        top = null;
    }
    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        System.out.println("Pushed: " + value);
    }
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow - Cannot pop");
            return -1;
        }
        int value = top.data;
        top = top.next;
        System.out.println("Popped: " + value);
        return value;
    }
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty - Cannot peek");
            return -1;
        }
        return top.data;
    }
    public boolean isEmpty() {
        return top == null;
    }
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack elements: ");
        Node current = top;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        stacklinked stack = new stacklinked();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();
        stack.pop();
        stack.display();
        System.out.println("Top element: " + stack.peek());
    }
}

