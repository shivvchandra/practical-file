public class P4_Q2 {
    public static void main(String[] args) {
        int n = 0;
        int a = 2;

        //calculates sum and prints results
        for (int i = a; i < 11; i++) {
            n = n + (int)(Math.pow(a, i));
        }
        System.out.println(n);
    }
}