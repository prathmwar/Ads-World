class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;

    }
}

public class Main {
    public static void main(String[] args) {

        Node head = new Node(1);
        Node tail = head;
        for(int i = 2;i<=5;i++)
        {
            tail.next = new Node(i);
            tail = tail.next;
        }

        Node tmp = head;
        while (tmp!=null)
        {
            System.out.print(tmp.data + " ");
            tmp = tmp.next;
        }
    }
}
