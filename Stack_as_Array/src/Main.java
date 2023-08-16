import java.util.Scanner;

class Stack {
    private int[] a;
    private int top;
    private int maxSize;

    Stack(int maxSize) {
        this.maxSize = maxSize;
        a = new int[maxSize];
        top = -1;
    }

    void push(int x) {
        if (top == maxSize - 1) {
            System.out.println("Stack is full. Cannot push.");
            return;
        }
        a[++top] = x;
        System.out.println("Pushed " + x + " onto the stack.");
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        int poppedVal = a[top--];
        return poppedVal;
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return a[top];
    }

    boolean isEmpty() {
        return top == -1;
    }

    int size() {
        return top + 1;
    }

    void displayStack() {
        System.out.print("Stack: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the stack: ");
        int Size = sc.nextInt();
        Stack stack = new Stack(Size);

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Check if the stack is empty");
            System.out.println("5. Get the size of the stack");
            System.out.println("6. Display the stack");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to push: ");
                    int element = sc.nextInt();
                    stack.push(element);
                    break;
                case 2:
                    int popped = stack.pop();
                    if (popped != -1) {
                        System.out.println("Popped: " + popped);
                    }
                    break;
                case 3:
                    int topElem = stack.peek();
                    if (topElem != -1) {
                        System.out.println("Top element: " + topElem);
                    }
                    break;
                case 4:
                    if (stack.isEmpty()) {
                        System.out.println("Stack is empty.");
                    } else {
                        System.out.println("Stack is not empty.");
                    }
                    break;
                case 5:
                    System.out.println("Size of the stack: " + stack.size());
                    break;
                case 6:
                    stack.displayStack();
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        } while (choice != 7);
    }
}
