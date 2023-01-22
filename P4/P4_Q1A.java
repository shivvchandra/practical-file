public class P4_Q1A {
    public static void main(String[] args) {

        //calculates rest of series and prints results
        for (int i = 0; i < 10; i++) {
            int n = 1 + (i * (i+1) / 2);
            System.out.print(n + " ");
        }
    }
}