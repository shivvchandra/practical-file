import java.util.Scanner;
public class P2_Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //takes input of salary
        System.out.println("Input salary: ");
        int salary = sc.nextInt();

        //takes input of years of employment
        System.out.println("Input years of employment: ");
        int year = sc.nextInt();

        //checks if user has been employed for more than 5 years and prints results
        if (year >= 5) {
            System.out.println("Your bonus is: " + salary * 0.05);
        }
        else {
            System.out.println("You are not eligible for bonus");
        }
    }
}