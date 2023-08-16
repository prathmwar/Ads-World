import java.util.Scanner;

class Node
{
    int data;
    Node next;

    Node(int x)
    {
        data = x;
        next = null;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the no of nodes: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int value;
        System.out.println("Enter the value: ");
        value = sc.nextInt();
        Node head = new Node(value);
        Node tail = head;
        for (int i = 2; i <= n; i++) {
            value = sc.nextInt();
            tail.next = new Node(value);
            tail = tail.next;

        }
        System.out.println("Created linked list is: ");
        Node tmp = head;
        while (tmp != null) {
            System.out.print(tmp.data + "-->");
            tmp = tmp.next;
        }
        System.out.println("null");

        System.out.println("reversed linked list is: ");
        PR(head);
        System.out.println("null");
    }

    public static void PR(Node head)
    {
        Node tmp = head;
        if (tmp == null)
            return;

        PR(head.next);
        System.out.print(head.data + "-->");
    }
}