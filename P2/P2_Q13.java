import java.util.Scanner;
public class P2_Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //takes input of marks
        System.out.println("Input marks: ");
        int marks = sc.nextInt();

        //checks marks and prints results
        if (marks > 89 && marks < 101) {
            System.out.println("Your grade is A");
        }
        else if (marks > 79 && marks < 90) {
            System.out.println("Your grade is B");
        }
        else if (marks > 69 && marks < 80) {
            System.out.println("Your grade is C");
        }
        else if (marks > 59 && marks < 70) {
            System.out.println("Your grade is D");
        }
        else if (marks > 49 && marks < 60) {
            System.out.println("Your grade is E");
        }
        else if (marks < 50) {
            System.out.println("Your grade is F");
        }
        else {
            System.out.println("Invalid input");
        }
    }
}
