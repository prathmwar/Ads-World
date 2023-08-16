import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class Main
{
    public static void main(String[] args)
    {
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

        boolean result = isSorted(head);
        System.out.println("Is the linked list sorted: " + result);
    }

    public static boolean isSorted(Node head)
    {
        if(head == null || head.next == null)
            return true;
        Node curr = head;
        while(curr.next!=null)
        {
            if(curr.data > curr.next.data)
                return false;
            curr = curr.next;
        }
        return true;
    }
}
