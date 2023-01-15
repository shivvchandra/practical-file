import java.util.Scanner;
public class P2_Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //takes input of 3 numbers
        System.out.print("Input the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Input the second number: ");
        int num2 = sc.nextInt();
        System.out.print("Input the third number: ");
        int num3 = sc.nextInt();

        //finds biggest and smallest of numbers
        int high = num1;
        if (num2 > high) {
            high = num2;
        }
        if (num3 > high) {
            high = num3;
        }
        int low = num1;
        if (num2 < low) {
            low = num2;
        }
        if (num3 < low) {
            low = num3;
        }

        //prints results
        System.out.println("The greatest number is: " + high);
        System.out.println("The smallest number is: " + low);
    }
}
