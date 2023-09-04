class Queue {
    private int front, rear, size;
    private int n;
    private int a[];

    public Queue(int capacity) {
        this.n = capacity;
        a = new int[capacity];
        front = rear = size = 0;
    }

    public void enQueue(int data) {
        if (size == n) {
            System.out.println("Queue is full. Cannot enqueue.");
            return;
        }
        a[rear] = data;
        rear = (rear + 1) % n;
        size++;
    }

    public int deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }
        int data = a[front];
        front = (front + 1) % n;
        size--;
        return data;
    }

    public boolean isEmpty() {
        if(size==0)
            return true;
        return false;
    }

    public int size() {
        return size;
    }
}

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(5);

        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.enQueue(5);

        System.out.println("Queue size: " + queue.size());

        System.out.println("Dequeued: " + queue.deQueue());
        System.out.println("Dequeued: " + queue.deQueue());

        System.out.println("Queue size: " + queue.size());

        queue.enQueue(6);
        queue.enQueue(7);
        System.out.println("Enqueued 6 & 7");
        System.out.println("Queue size: " + queue.size());

        System.out.println("Is queue empty: " + queue.isEmpty());
    }
}
