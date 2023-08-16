import java.util.Scanner;

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
        System.out.println("Enter the no of nodes: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int value;
        System.out.println("Enter the values in the linked list: ");
        value = sc.nextInt();
        Node head = new Node(value);
        Node tail = head;
        for (int i = 2; i <= n; i++) {
            value = sc.nextInt();
            tail.next = new Node(value);
            tail = tail.next;
        }

        deleteLast(head);

        System.out.println("Linked list after deletion is: ");
        Node tmp = head;
        while (tmp != null) {
            System.out.print(tmp.data + " ");
            tmp = tmp.next;
        }
        System.out.println();
    }

    public static void deleteLast(Node head)
    {
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }

        if(head.next == null)
            return;

        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next!=null)
        {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next=null;

    }
}
