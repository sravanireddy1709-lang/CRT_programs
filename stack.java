package cse;
public class stack {
    private int top;
    private int capacity;
    private int[] stack;
    public stack(int size) {
        capacity = size;
        stack = new int[capacity];
        top = -1;
    }
    public void push(int item) {
        if (top == capacity - 1) {
            System.out.println("Stack is full");
            return;
        }
        stack[++top] = item;
    }
    public void pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        top--;
    }
    public void peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Top element is: " + stack[top]);
    }
    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        stack s = new stack(5);
        s.push(10);
        s.push(20);
        s.push(30);
        s.display();
        s.pop();
        s.display();
        s.peek();
    }
}

