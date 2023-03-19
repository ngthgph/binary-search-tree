public class Node {
    int infor;
    Node left, right;
    Node(int x) {
        infor = x;
        left = right = null;
    }

    void insert(int x) {
        if(x >= this.infor) {
            if(this.right == null)
                this.right = new Node(x);
            else
                this.right.insert(x);
        } else {
            if(this.left == null)
                this.left = new Node(x);
            else
                this.left.insert(x);
        }
    }
}
