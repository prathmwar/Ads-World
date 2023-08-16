import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    LinkedList()
    {
        this.head = null;
    }

    void addAtBegin(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }


    void addNodeAtPosition(int pos, int data) {
        Node newNode = new Node(data);
        if (pos == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node prev = head;
        for (int i = 1; i < pos - 1; i++) {
            prev = prev.next;
        }
        newNode.next = prev.next;
        prev.next = newNode;
    }

    void addAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    void deleteByVal(int data) {
        if (head == null) return;
        if (head.data == data) {
            head = head.next;
            return;
        }
        Node prev = head;
        while (prev.next != null && prev.next.data != data) {
            prev = prev.next;
        }
        if (prev.next != null) {
            prev.next = prev.next.next;
        }
    }

    void removeNthFromEnd(int n) {
        int size = 0;
        Node temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        int val = size - n + 1;
        if (val <= 0 || val > size) {
            System.out.println("Invalid position");
            return;
        }
        deleteAtPos(val);
    }

    void deleteAtPos(int position) {
        if (position == 1) {
            head = head.next;
            return;
        }
        Node prev = head;
        for (int i = 1; i < position - 1; i++) {
            prev = prev.next;
        }
        if (prev.next != null) {
            prev.next = prev.next.next;
        }
    }

    boolean compareLinkedLists(Node head1, Node head2) {
        Node temp1 = head1;
        Node temp2 = head2;
        while (temp1 != null && temp2 != null) {
            if (temp1.data != temp2.data) {
                return false;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return temp1 == null && temp2 == null;
    }

    void displayList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("NULL");
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList linkedList = new LinkedList();

        System.out.print("Enter the number of nodes: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter value " + i + ": ");
            int value = scanner.nextInt();
            linkedList.addAtEnd(value);
        }

        System.out.println("Linked List:");
        linkedList.displayList();

        int choice;
        do {
            System.out.println("choices: ");
            System.out.println("1. Add a node at the beginning");
            System.out.println("2. Add a node at a specific position");
            System.out.println("3. Add a node at the end");
            System.out.println("4. Delete a node by value");
            System.out.println("5. Delete the nth node from the end");
            System.out.println("6. Compare two linked lists");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the value to add at the beginning: ");
                    int valToAddBegin = scanner.nextInt();
                    linkedList.addAtBegin(valToAddBegin);
                    System.out.println("Linked List after adding at the beginning:");
                    linkedList.displayList();
                    break;
                    
                case 2:
                    System.out.print("Enter the value to add: ");
                    int valueToAdd = scanner.nextInt();
                    System.out.print("Enter the position to add the value: ");
                    int positionToAdd = scanner.nextInt();
                    linkedList.addNodeAtPosition(positionToAdd, valueToAdd);
                    System.out.println("Linked List after adding at position " + positionToAdd + ":");
                    linkedList.displayList();
                    break;

                case 3:
                    System.out.print("Enter the value to add at the end: ");
                    int valueToAddEnd = scanner.nextInt();
                    linkedList.addAtEnd(valueToAddEnd);
                    System.out.println("Linked List after adding at the end:");
                    linkedList.displayList();
                    break;

                case 4:
                    System.out.print("Enter the value to delete: ");
                    int valueToDelete = scanner.nextInt();
                    linkedList.deleteByVal(valueToDelete);
                    System.out.println("Linked List after deleting " + valueToDelete + ":");
                    linkedList.displayList();
                    break;

                case 5:
                    System.out.print("Enter the value of n to delete nth node from the end: ");
                    int nValue = scanner.nextInt();
                    linkedList.removeNthFromEnd(nValue);
                    System.out.println("Linked List after deleting the nth node from the end:");
                    linkedList.displayList();
                    break;

                case 6:
                    LinkedList linkedList2 = new LinkedList();
                    System.out.println("Create a new linked list to compare:");
                    for (int i = 1; i <= n; i++) {
                        System.out.print("Enter value " + i + ": ");
                        int value = scanner.nextInt();
                        linkedList2.addAtEnd(value);
                    }
                    boolean areIdentical = linkedList.compareLinkedLists(linkedList.head, linkedList2.head);
                    if (areIdentical) {
                        System.out.println("The two linked lists are identical.");
                    } else {
                        System.out.println("The two linked lists are not identical.");
                    }
                    break;

                case 7:
                    System.out.println("Exiting the program.");
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;
            }

        } while (choice != 7);

        scanner.close();
    }
}