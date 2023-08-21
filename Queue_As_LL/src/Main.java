import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

class Q
{
    Node H,T;
    int cnt =0;
    Q()
    {
        H=T=null;
        cnt=0;
    }

    //time complexity: O(1)
    void enQueue(int x)
    {
        Node N = new Node(x);
        if(T==null)
        {
            H=T=N;
        }
        else
        {
            T.next=N;
            T=T.next;
        }
        System.out.println("Enqueued " + x);
    }

    //time complexity: O(1)
    void deQueue()
    {
        if(H==null)
        {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Dequeued " + H.data);
        H=H.next;
        if(H==null)
        {
            T=null;
        }
    }

    //time complexity: O(n)
    void size()
    {
        Node tmp =H;
        int cnt =0;
        while(tmp!=null)
        {
            tmp=tmp.next;
            cnt++;
        }
        System.out.println("size is: " + cnt);
    }

    //time complexity: O(1)
    void pF()
    {
        System.out.println("Front is at: " + H.data);
    }

    //time complexity: O(1)
    void pR()
    {
        System.out.println("Rear is at: " + T.data);
    }

    //time complexity: O(n)
    void display()
    {
        Node tmp = H;
        System.out.println("Elements in queue are: ");
        while(tmp!=null)
        {
            System.out.println(tmp.data);
            tmp = tmp.next;
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q queue = new Q();

        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++)
        {
            int x = sc.nextInt();
            queue.enQueue(x);
        }

        queue.display();
        queue.pF();
        queue.pR();
        queue.deQueue();
        queue.size();
    }
}

//overall time complexity: O(n)