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
public class Main
{
    public static void main(String[] args) {
        System.out.println("Enter the no of nodes: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int value;
        System.out.println("Enter the value in linked list: ");
        value = sc.nextInt();
        Node head = new Node(value);
        Node tail = head;
        for(int i=2;i<=n;i++)
        {
            value = sc.nextInt();
            tail.next = new Node(value);
            tail = tail.next;

        }
        System.out.println("Enter the value to be inserted at end: ");
        value= sc.nextInt();
        head = insertAtEnd(head,value);

        System.out.println("Linked list after insertion at end is: ");
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();

    }

    public static Node insertAtEnd(Node head, int data)
    {
        Node temp = new Node(data);
        if(head == null)
        {
            return temp;
        }
        Node current = head;
        while (current.next != null)
        {
            current = current.next;
        }
        current.next = temp;
        return head;
    }
}