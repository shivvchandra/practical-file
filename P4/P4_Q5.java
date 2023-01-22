import java.util.Scanner;
public class P4_Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //takes input of number
        System.out.println("Input number: ");
        int n = sc.nextInt();

        //calculates sum and prints results
        double sum = 0.0;
        for (int i = 1; i < n+1; i++)
            if (i % 2 == 0) {
                sum = sum - (i / (double)(i + 1));
            }
            else {
                sum = sum + (i / (double)(i + 1));
            }

        System.out.println(sum);
    }
}