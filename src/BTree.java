public class BTree {
    Node root;
    BTree() {
        root = null;
    }

    boolean isEmpty() {
        return (root == null);
    }

    void search(Node p, int x) {
        if(p.left != null)
            search(p.left, x);
        if(p.infor>x)
            visit(p);
        if(p.right != null)
            search(p.right, x);
    }

    void insert(int x) {
        if(root == null)
            root = new Node(x);
        else root.insert(x);
    }

    void insertMany(int[] a) {
        for (int j : a) insert(j);
    }

    void visit (Node p) {
        if(p != null)
            System.out.print(p.infor + " ");
    }

    void preOrder(Node p) {
        visit(p);
        if(p.left != null)
            preOrder(p.left);
        if(p.right != null)
            preOrder(p.right);
    }

    void inOrder(Node p) {
        if(p.left != null)
            inOrder(p.left);
        visit(p);
        if(p.right != null)
            inOrder(p.right);
    }
}
