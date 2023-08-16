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
        System.out.println("Enter the no of nodes for the first linked list: ");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int value;
        System.out.println("Enter the values in the first linked list: ");
        value = sc.nextInt();
        Node head1 = new Node(value);
        Node tail1 = head1;
        for (int i = 2; i <= n1; i++) {
            value = sc.nextInt();
            tail1.next = new Node(value);
            tail1 = tail1.next;
        }

        System.out.println("Enter the no of nodes for the second linked list: ");
        int n2 = sc.nextInt();
        System.out.println("Enter the values in the second linked list: ");
        value = sc.nextInt();
        Node head2 = new Node(value);
        Node tail2 = head2;
        for (int i = 2; i <= n2; i++) {
            value = sc.nextInt();
            tail2.next = new Node(value);
            tail2 = tail2.next;
        }

        boolean result = isEqual(head1, head2);
        System.out.println("Are the two linked lists equal: " + result);

        boolean sorted1 = isSorted(head1);
        boolean sorted2 = isSorted(head2);

        System.out.println("Is the first linked list sorted: " + sorted1);
        System.out.println("Is the 2nd linked list sorted: " + sorted2);
    }

    public static boolean isEqual(Node head1,Node head2) {
        Node x = head1;
        Node y = head2;

        while (x != null && y != null)
        {
            if (x.data != y.data)
                return false;
            x = x.next;
            y = y.next;
        }
        return x == null && y == null;
    }

    public static boolean isSorted(Node head)
    {
        Node curr = head;
        while(curr != null && curr.next!=null)
        {
            if(curr.data>curr.next.data)
                return false;
            curr = curr.next;
        }
        return true;
    }
}
