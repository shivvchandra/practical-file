public class P4_Q1H {
    public static void main(String[] args) {

        //calculates rest of series and prints results
        for (int i = 1; i < 11; i++) {
            for (int n = 1; n < i+1; n++) {
                System.out.print(n);
            }
            System.out.print(" ");
        }
    }
}