import java.util.Scanner;
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

class Q {
    Node front, rear;
    int size;

    Q() {
        front = rear = null;
        size = 0;
    }

    void enQueue(int data) {
        Node newNode = new Node(data);
        if (rear == null)
            front = rear = newNode;
        else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    int deQueue() {
        if (front == null) {
            return -1;
        }
        int data = front.data;
        front = front.next;
        if (front == null)
            rear = null;
        size--;
        return data;
    }

    int size() {
        return size;
    }
}

public class Main {
    public static Q revQ(Q que) {
        Q newQ = new Q();

        // Reversing the elements from the original queue
        while (que.size() > 0) {
            int front = que.deQueue();
            Node newNode = new Node(front);

            if (newQ.front == null) {
                newQ.front = newQ.rear = newNode;
            } else {
                newNode.next = newQ.front;
                newQ.front = newNode;
            }

            newQ.size++;
        }

        return newQ;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Q queue = new Q();

        System.out.println("Enter the number of elements in the queue:");
        int n = scanner.nextInt();

        System.out.println("Enter the elements:");

        // Enqueuing elements into the original queue
        for (int i = 0; i < n; i++) {
            int element = scanner.nextInt();
            queue.enQueue(element);
        }

        Q result = revQ(queue);

        System.out.println("Final Reversed Queue:");

        // Printing the reversed elements from the result queue
        while (result.size() > 0) {
            System.out.print(result.deQueue() + " ");
        }
    }
}
