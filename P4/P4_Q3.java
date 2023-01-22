import java.util.Scanner;
public class P4_Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //takes input of number
        System.out.println("Input number: ");
        int n = sc.nextInt();

        //calculates sum and prints results
        double sum = 0;
        for (int i = 1; i < n+1; i++) {
            sum = sum + (1.0 / i);
        }
        System.out.println(sum);
    }
}