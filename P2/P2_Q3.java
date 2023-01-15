import java.util.Scanner;
public class P2_Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //takes input of number
        System.out.print("Input a number: ");
        int number = sc.nextInt();

        //checks if number is odd, even or zero
        if (number == 0) {
            System.out.println("The number is zero");
        } else if (number % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
    }
}
