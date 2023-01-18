import java.util.Scanner;
public class P3_Q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i < 11; i++) {
            //takes input of numbers
            System.out.print("Input number "+i+": ");
            int n = sc.nextInt();

            //checks if number is prime and prints results
            if (n % i == 0) {
                continue;
            }
            else {
                System.out.println(n+" is prime.");
            }
        }
    }
}
