import java.util.Scanner;
public class P2_Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //takes input of number
        System.out.print("Input a number: ");
        int num = sc.nextInt();

        //checks the divisibility of the number
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println(num + " is divisible by 3 and 5");
        } else if (num % 3 == 0) {
            System.out.println(num + " is divisible by 3");
        } else if (num % 5 == 0) {
            System.out.println(num + " is divisible by 5");
        } else {
            System.out.println(num + " is not divisible by either 3 or 5");
        }
    }
}
