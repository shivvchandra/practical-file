import java.util.Scanner;
public class P2_Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //takes input of year
        System.out.print("Input a year: ");
        int year = sc.nextInt();

        //checks if the year is leap
        int isLeap = 0;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeap = 1;
                }
            } else {
                isLeap = 1;
            }
        }

        //prints results
        if (isLeap == 1) {
            System.out.println(year + " is a leap year.");
        }
        else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
