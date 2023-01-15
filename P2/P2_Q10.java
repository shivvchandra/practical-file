import java.util.Scanner;
public class P2_Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //takes input of age
        System.out.println("Input age: ");
        int age = sc.nextInt();

        //checks if vote is eligible
        if (age >= 18) {
            System.out.println("You are eligible to vote");
        }
        else {
            System.out.println("You are not eligible to vote");
        }
    }
}
