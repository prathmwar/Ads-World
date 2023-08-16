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
        System.out.println("Enter N:");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Value;
        System.out.println("Enter value: ");
        Value =sc.nextInt();
        Node head = new Node(Value);
        Node tail = head;
        for (int i = 2; i <= N; i++)
        {
            Value=sc.nextInt();
            tail.next = new Node(Value);
            tail = tail.next;
        }
        System.out.println("Created linked list is: ");
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}