import java.util.Scanner;
public class P4_Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //takes input of number
        System.out.println("Input number n: ");
        double n = sc.nextDouble();
        System.out.println("Input number a: ");
        double a = sc.nextDouble();

        //calculates sum and prints results
        double sum = 0.0;
        for (double i = 2.0; i < n+1; i++) {
            sum = sum + (a / n);
        }
        System.out.println(sum);
    }
}