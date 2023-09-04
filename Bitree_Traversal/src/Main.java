class Node {
    int data;
    Node l, r;

    Node(int x) {
        data = x;
        l = r = null;
    }
}

class BiTree {
    Node root;

    BiTree() {
        root = null;
    }

    void inorder(Node node) {
        if (node == null)
            return;
        inorder(node.l);
        System.out.print(node.data + " ");
        inorder(node.r);
    }

    void preorder(Node node) {
        if (node == null)
            return;
        System.out.print(node.data + " ");
        inorder(node.l);
        inorder(node.r);
    }

    void postorder(Node node) {
        if (node == null)
            return;
        inorder(node.l);
        inorder(node.r);
        System.out.print(node.data + " ");
    }

    int H(Node root) {
        if (root == null)
            return 0;
        int left = H(root.l);
        int right = H(root.r);
        return (1 + Math.max(left, right));
    }

    public int SLL(Node node) {
        if (node == null)
            return 0;
        int s = 0;
        if (node.l != null && node.l.l == null && node.l.r == null)
            s += node.l.data;

        s += SLL(node.l);
        s += SLL(node.r);

        return s;
    }

    public int SRL(Node node)
    {
        if(node==null)
            return 0;
        int s=0;
        if(node.r !=null && node.r.r==null && node.r.l ==null)
            s += node.r.data;

        s += SRL(node.l);
        s += SRL(node.r);

        return s;
    }
}

public class Main {
    public static void main(String[] args) {
        BiTree tree = new BiTree();
        tree.root = new Node(1);
        tree.root.l = new Node(2);
        tree.root.r = new Node(3);
        tree.root.l.l = new Node(4);
        tree.root.l.r = new Node(5);
        tree.root.r.l = new Node(6);
        tree.root.r.r = new Node(7);

        System.out.println("Inorder traversal is: ");
        tree.inorder(tree.root);
        System.out.println();

        System.out.println("Preorder traversal is: ");
        tree.preorder(tree.root);
        System.out.println();

        System.out.print("Postorder traversal is:" + " ");
        tree.postorder(tree.root);
        System.out.println();

        int height = tree.H(tree.root);
        System.out.println("Height of the tree is: " + height);
        System.out.println("Depth of the tree: " + height);

        int S = tree.SLL(tree.root);
        System.out.println("Sum of left leaf nodes is: " + S);

        int SR = tree.SRL(tree.root);
        System.out.println("Sum of the right leaf nodes is: " + SR);
    }
}
