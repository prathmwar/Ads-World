class Node {
    int data;
    Node l, r;

    Node(int x) {
        data = x;
        l = r = null;
    }
}


class BST {
    Node root;

    Node addN(Node rt, int t) {
        if (rt == null) {
            rt = new Node(t);
            return rt;
        } else if (t < rt.data)
            rt.l = addN(rt.l, t);
        else if (t > rt.data)
            rt.r = addN(rt.r, t);
        return rt;
    }

    boolean SNL(Node rt, int t) {
        Node tmp = rt;
        while (tmp != null) {
            if (tmp.data == t)
                return true;
            else if (t < tmp.data) {
                tmp = tmp.l;
            } else
                tmp = tmp.r;
        }
        return false;
    }

    boolean SNR(Node rt, int t) {
        if (rt != null) {
            if (rt.data < t)
                return SNR(rt.r, t);
            else if (rt.data > t)
                return SNR(rt.l, t);
            else
                return true;
        }
        return false;
    }

    boolean search(int key) {
        return search(root, key);
    }

    private boolean search(Node node, int key) {
        if (node == null)
            return false;

        if (node.data == key)
            return true;

        if (key < node.data)
            return search(node.l, key);
        else
            return search(node.r, key);
    }

    boolean isB(Node rt, int l, int r) {
        if (rt == null)
            return true;
        if (rt.data > l && rt.data < r) {
            boolean left = isB(rt.l, l, rt.data);
            boolean right = isB(rt.r, rt.data, r);

            return (left && right);
        }
        return false;
    }

    void printTree(Node node) {
        if (node != null) {
            printTree(node.l);
            System.out.print(node.data + " ");
            printTree(node.r);
        }
    }

    void printTree() {
        printTree(root);
    }
}

public class Main {
    public static void main(String[] args) {
        BST tree = new BST();

        tree.root = new Node(4);
        tree.root.l = new Node(2);
        tree.root.r= new Node( 6);
        tree.root.l.l = new Node(1);
        tree.root.l.r = new Node(3);
        tree.root.r.l= new Node( 5);
        tree.root.r.r = new Node(7);

        System.out.println("Search Node Left:");
        System.out.println(tree.SNL(tree.root, 4));
        System.out.println(tree.SNL(tree.root, 6));

        System.out.println("Search Node Right:");
        System.out.println(tree.SNR(tree.root, 7));
        System.out.println(tree.SNR(tree.root, 2));

        System.out.println("Print Tree:");
        tree.printTree();
        System.out.println();

        tree.root.r.r.r = tree.addN(tree.root.r.r.r,8);

        System.out.println("After adding node: ");
        tree.printTree();
        System.out.println();


        int Key = 4;
        System.out.println("Recursive search for: " + Key);
        System.out.println(tree.search(Key));
    }
}
