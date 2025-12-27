import java.util.Scanner;
class Node {
    int data;
    Node next; 
    Node(int data) {
        this.data = data;
        this.next = null; 
    }
}
class SingleLinkedList {
    Node head;
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }
    public void deleteByKey(int key) {
        Node current = head;
        Node previous = null;
        if (current != null && current.data == key) {
            head = current.next;
            return;
        }
        while (current != null && current.data != key) {
            previous = current;
            current = current.next;
        }
        if (current == null) {
            System.out.println("Element " + key + " not found.");
            return;
        }
        previous.next = current.next;
    }
    public void display() {
        Node current = head;
        System.out.print("Singly Linked List: ");
        if (head == null) {
            System.out.println("empty");
            return;
        }
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("NULL"); 
    }
    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        Scanner scan = new Scanner(System.in);
        char choice;

        do {
            System.out.println("\nSingly Linked List Operations Menu:");
            System.out.println("1. Insert an element");
            System.out.println("2. Delete an element by key");
            System.out.println("3. Display the list");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int option = scan.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter integer element to insert: ");
                    list.insert(scan.nextInt());
                    break;
                case 2:
                    System.out.print("Enter integer element to delete: ");
                    list.deleteByKey(scan.nextInt());
                    break;
                case 3:
                    list.display();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong Entry\n");
                    break;
            }
            System.out.println("\nDo you want to continue? (Type y or n)");
            choice = scan.next().charAt(0);
        } while (choice == 'Y' || choice == 'y');
        scan.close();
    }
}
