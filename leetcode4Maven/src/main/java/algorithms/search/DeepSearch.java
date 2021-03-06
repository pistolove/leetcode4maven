package algorithms.search;

public class DeepSearch {

    public static void main(String[] args) {
        getAllRank(1);
    }

    static int[] book = new int[10];
    static int[] a = new int[10];
    static int n = 4;

    public static void getAllRank(int index) {
        if (index == n + 1) {
            for (int i = 1; i <= n; i++) {
                System.err.print(a[i] + " ");
            }
            System.err.println();
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (book[i] == 0) {
                a[index] = i;
                book[i] = 1;
                getAllRank(index + 1);
                book[i] = 0; // 不在手上
            }
        }

    }

}
