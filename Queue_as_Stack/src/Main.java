class Stack {
     int top;
     int[] a;

    Stack(int n) {
        a = new int[n];
        top = -1;
    }

    public void push(int data) {
        if (top == a.length - 1) {
            System.out.println("Stack is full");
            return;
        }
        a[++top] = data;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return a[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }
}

class Q {
    Stack st1; // For enqueue
    Stack st2; // For dequeue
    public Q(int s) {
        st1 = new Stack(s);
        st2 = new Stack(s);
    }

    public void enQueue(int data) {
        st1.push(data);
    }

    public int deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        if (st2.isEmpty()) {
            while (!st1.isEmpty()) {
                st2.push(st1.pop());
            }
        }

        return st2.pop();
    }

    public boolean isEmpty() {
        return st1.isEmpty() && st2.isEmpty();
    }

    public int size() {
        return st1.size() + st2.size();
    }
}

public class Main {
    public static void main(String[] args) {
        Q queue = new Q(5);

        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.enQueue(5);

        System.out.println("Queue size: " + queue.size());

        System.out.println("Dequeued: " + queue.deQueue());
        System.out.println("Dequeued: " + queue.deQueue());

        System.out.println("Queue size: " + queue.size());

        System.out.println("Enqueued  6 & 7");
        queue.enQueue(6);
        queue.enQueue(7);

        System.out.println("Queue size: " + queue.size());

        System.out.println("Is queue empty: " + queue.isEmpty());
    }
}
