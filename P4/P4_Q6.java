import java.util.Scanner;
public class P4_Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //takes input of number
        System.out.print("Input number: ");
        int n = sc.nextInt();

        //calculates sum and prints results
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            double f = 1;
            for (int o = 1; o <= i; o++) {
                f = f * o;
            }
            sum = sum + (1.0 / f);
        }
        System.out.println(sum);
    }
}