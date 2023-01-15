import java.util.Scanner;
public class P2_Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //takes input of number
        System.out.println("Input number: ");
        int num = sc.nextInt();

        //checks if number is odd or even and prints results
        if (num % 2 == 0) {
            System.out.println(num * num);
        }
        else {
            System.out.println(num * num * num);
        }
    }
}