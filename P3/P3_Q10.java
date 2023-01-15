import java.util.Scanner;
public class P3_Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        //takes input of number and adds them to sum
        for (int i = 1; i < 11; i++) {
            System.out.print("Input number " + i + ": ");
            int num = sc.nextInt();
            sum = sum + num;
        }
        //prints results
        System.out.println(sum);
    }
}
