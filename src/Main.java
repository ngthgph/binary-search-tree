import java.util.Scanner;

public class Main {
    static void input(int[] a, int n) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input: ");
        System.out.print("n = ");
        n = input.nextInt();
        System.out.println();

        System.out.println("a[] = ");
        a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }
    }
    public static void main(String[] args) {
        BTree t = new BTree();

        int n = 7;
        int[] a = {25,10,30,5,20,15};
//        int[] a = new int[n];
//        input(a, n);

        t.insertMany(a);

        System.out.println("\nPre-order traverse: ");
        t.preOrder(t.root);

        System.out.println("\nIn-order traverse: ");
        t.inOrder(t.root);

        System.out.println("\nSearch: ");
        t.search(t.root, 10);
        System.out.println();

    }
}