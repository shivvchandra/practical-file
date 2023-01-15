import java.util.Scanner;
public class P3_Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //takes input of number
        System.out.println("Input number: ");
        int num = sc.nextInt();

        int i;
        int sum = 0;

        //calculates sum of numbers till num and prints results
        for (i = 0; i < num+1; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
