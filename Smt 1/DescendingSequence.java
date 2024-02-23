public class DescendingSequence {

    public static void main(String[] args) {
        DescendingSequenceRecursive(5);
        System.out.println();

        DescendingSequenceInterative(5);
    }

    static void DescendingSequenceRecursive(int n) {
    if (n == 0) { System.out.print("0\n");
    } else {
        System.out.print(n + " "); 
        DescendingSequenceRecursive(n - 1);
        }
    }
    static void DescendingSequenceInterative(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }

}