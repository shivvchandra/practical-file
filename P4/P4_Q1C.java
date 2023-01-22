public class P4_Q1C {
    public static void main(String[] args) {
        int n = 0;
        System.out.print(n);

        //calculates rest of series and prints results
        for (int i = 3; i < 20; i = i+2) {
            n = n + i;
            System.out.print(" " + n);
        }
    }
}