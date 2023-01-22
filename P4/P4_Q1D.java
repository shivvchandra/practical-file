public class P4_Q1D {
    public static void main(String[] args) {
        int n = 1;
        System.out.print(n);

        //calculates rest of series and prints results
        for (int i = 2; i < 11; i++) {
            n = n + 2;
            if (i % 2 == 0)
                System.out.print(" " + -n);
            else
                System.out.print(" " + n);
        }
    }
}