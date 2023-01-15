import java.util.Scanner;
public class P2_Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //takes input of number
        System.out.print("Input a number: ");
        int num = sc.nextInt();

        //checks if number is positive or negative, then if it is even or odd
        if (num > 0) {
            if (num % 2 == 0) {
                System.out.println(num + " is positive and even");
            }
            else {
                System.out.println(num + " is positive and odd");
            }
        }
        else if (num < 0) {
            if (num % 2 == 0) {
                System.out.println(num + " is negative and even");
            }
            else {
                System.out.println(num + " is negative and odd");
            }
        }
        else {
            System.out.println(num + " is zero");
        }
    }
}
