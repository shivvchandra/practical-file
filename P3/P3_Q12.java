import java.util.Scanner;
public class P3_Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //takes input of number
        System.out.println("Input number: ");
        int num = sc.nextInt();

        //checks if number is prime and sets flag accordingly
        int prime = 1;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                prime = 0;
                break;
            }
        }

        //prints results
        if (prime == 0) {
            System.out.println(num + " is not prime.");
        }
        else {
            System.out.println(num + " is prime.");
        }

    }
}
