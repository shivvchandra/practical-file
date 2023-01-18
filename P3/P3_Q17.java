import java.util.Scanner;
public class P3_Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sume = 0;
        int sumo = 0;

        while (true) {
            //takes input of number
            System.out.println("Input number (0 to quit): ");
            int n = sc.nextInt();

            //checks if number is +ve and even or -ve and odd and adds to sum
            if (n == 0) {
                break;
            }
            else if (n % 2 == 0 && n > 0) {
                sume += n;
            }
            else if (n % 2 != 0 && n < 0) {
                sumo += n;
            }
        }

        //prints results
        System.out.println("Positive even sum: " + sume);
        System.out.println("Negative odd sum: " + sumo);
    }
}
