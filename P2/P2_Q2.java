import java.util.Scanner;
public class P2_Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //takes input of number
        System.out.print("Input a number: ");
        int number = sc.nextInt();

        //checks if the number is positive, negative or zero
        if (number > 0) {
            System.out.println("The number is positive");
        } else if (number < 0) {
            System.out.println("The number is negative");
        } else {
            System.out.println("The number is zero");
        }
    }
}
