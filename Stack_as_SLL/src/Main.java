import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

class Stack {
    Node H;
    int cnt;

    Stack() {
        H = null;
        cnt = 0;
    }

    void push(int x) {
        if (H == null) {
            H = new Node(x);
        } else
        {
            Node y = new Node(x);
            y.next = H;
            H = y;
        }
        cnt++;
    }

    int pop() {
        if (H == null) {
            return -1;
        } else {
            int ele = H.data;
            H = H.next;
            cnt--;
            return ele;
        }
    }

    void peek() {
        System.out.println("peek" + H);
    }

    int size() {
        return cnt;
    }

    void displayStack() {
        Node current = H;
        System.out.print("Stack: ");
        while (current != null)
        {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack stack = new Stack();

       /* int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Get the size of the stack");
            System.out.println("5. Display the stack");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to push: ");
                    int ele = sc.nextInt();
                    stack.push(ele);
                    break;
                case 2:
                    int popped = stack.pop();
                    if (popped != -1) {
                        System.out.println("Popped element is: " + popped);
                    }
                    break;
                case 3:
                    int top = stack.peek();
                    if (top != -1) {
                        System.out.println("Top element is: " + top);
                    }
                    break;
                case 4:
                    System.out.println("Size of the stack is: " + stack.size());
                    break;
                case 5:
                    stack.displayStack();
                    break;
                case 6:
                    System.out.println("Exiting.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        } while (choice != 6);
        */

        stack.push(7);
        stack.push(8);
        stack.push(9);

        stack.displayStack();

    }
}
