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
        System.out.println("Enter the value: ");
        value = sc.nextInt();
        Node head = new Node(value);
        Node tail = head;
        for(int i=2;i<=n;i++)
        {
            value = sc.nextInt();
            tail.next = new Node(value);
            tail = tail.next;

        }
        System.out.println("Created linked list is: ");
        Node tmp = head;
        while(tmp !=null) {
            System.out.print(tmp.data + " ");
            tmp = tmp.next;
        }
        System.out.println();

        System.out.println("Enter the value after which node has to be inserted: ");
        int afterValue = sc.nextInt();
        System.out.println("Enter the value to be inserted: ");
        int insertValue = sc.nextInt();
        head = insertAfterValue(head,afterValue,insertValue);

        System.out.println("Linked list after insertion is: ");
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();

    }

    public static Node insertAfterValue(Node head, int afterValue, int insertValue)
    {
        Node current = head;
        while (current!=null)
        {
            if(current.data == afterValue)
            {
                Node temp = new Node(insertValue);
                temp.next = current.next;
                current.next=temp;
                return head;
            }
            current = current.next;
        }
        System.out.println("Value " + afterValue + " not found in the linked list.");
        return head;
    }
}