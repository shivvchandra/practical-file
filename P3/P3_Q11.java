import java.util.Scanner;
public class P3_Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //takes input of number
        System.out.print("Input number: ");
        int num = sc.nextInt();

        //multiplies num by every number below it
        int f = 1;
        for (int i = 1; i <= num; i++) {
            f *= i;
        }

        //prints results
        System.out.println(f);
    }
}