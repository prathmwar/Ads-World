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
    public static Q revQ(Q que, int k) {
        int n = que.size();

        if (k > n || k < 1) {
            return que;
        }

        Q newQ = new Q();
        Node H = null;

        for (int i = 0; i < n - k; i++) {
            int front = que.deQueue();
            que.enQueue(front);
        }

        for (int i = 0; i < k; i++) {
            int front = que.deQueue();
            if (H == null) {
                H = new Node(front);
            } else {
                Node newNode = new Node(front);
                newNode.next = H;
                H = newNode;
            }
        }

        Node curr = H;
        while (curr != null) {
            newQ.enQueue(curr.data);
            curr = curr.next;
        }

        return newQ;
    }

    public static void main(String[] args) {
        Q queue = new Q();
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.enQueue(5);
        queue.enQueue(6);
        queue.enQueue(7);
        queue.enQueue(8);
        queue.enQueue(9);
        queue.enQueue(10);
        int k = 5;

        Q result = revQ(queue, k);

        System.out.print("Final Reversed Queue: ");

        // Printing the remaining enqueued elements from the original queue
        while (queue.size() > 0) {
            System.out.print(queue.deQueue() + " ");
        }

        // Printing the reversed elements from the new queue (including k-th element)
        while (result.size() > 0) {
            System.out.print(result.deQueue() + " ");
        }
    }
}

