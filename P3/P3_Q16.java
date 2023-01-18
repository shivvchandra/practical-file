import java.util.Scanner;
public class P3_Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sume = 0;
        int sumo = 0;

        //takes input of number
        System.out.println("Input number: ");
        int n = sc.nextInt();

        //counts up till n and adds to sum
        for (int i = 1; i < n+1; i++) {
            if (i % 2 == 0) {
                sume = sume + i;
            }
            else {
                sumo = sumo + i;
            }
        }

        //prints results
        System.out.println("Even sum: "+sume);
        System.out.println("Odd sum: "+sumo);
    }
}