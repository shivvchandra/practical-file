import java.util.Scanner;
public class P3_Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //takes input of 2 numbers
        System.out.println("Input number to start: ");
        int num1 = sc.nextInt();
        System.out.println("Input number to end: ");
        int num2 = sc.nextInt();

        //checks for errors, if none found then prints results
        if (num1 > num2) {
            System.out.println("Invalid Input! (n1 is bigger than n2)");
        }
        else if (num1 == num2) {
            System.out.println("Invalid Input! (n1 is equal to n2)");
        }
        else {
            for (; num1 < num2+1; num1++) {
                System.out.println(num1);
            }
        }
    }
}
