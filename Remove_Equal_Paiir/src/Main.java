import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

class Stack {
    Node H;
    int cnt;

    Stack() {
        H = null;
        cnt = 0;
    }

    void push(int x) {
        if (H == null) {
            H = new Node(x);
        } else {
            Node y = new Node(x);
            y.next = H;
            H = y;
        }
        cnt++;
    }

    int pop() {
        if (H == null)
            return -1;
        else {
            int ele = H.data;
            H = H.next;
            cnt--;
            return ele;
        }
    }

    int peek() {
        if (H == null)
            return -1;

        return H.data;
    }

    boolean isEmpty() {
        return H == null;
    }

    int size() {
        return cnt;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack st = new Stack();

        System.out.print("Enter the length of the char array: ");
        int n = sc.nextInt();
        char s[] = new char[n];

        System.out.println("Enter the characters:");
        for (int i = 0; i < n; i++) {
            s[i] = sc.next().charAt(0);
        }

        for (int i = 0; i < s.length; i++) {
            if (!st.isEmpty() && (st.peek() == s[i])) {
                st.pop();
            } else {
                st.push(s[i]);
            }
        }

        int M = st.size();

        char res[] = new char[M];

        for (int i = 0; i < M; i++) {
            res[M - 1 - i] = (char) st.pop();
        }

        System.out.print("Resulting string is: ");
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]);
        }
    }
}
