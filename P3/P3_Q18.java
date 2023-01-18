import java.util.Scanner;
public class P3_Q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 1;

        //takes input of number
        System.out.println("Input number: ");
        int n = sc.nextInt();

        //adds numbers and prints results
        for (int i = 1; i < n+1; i++) {
            a = b;
            b = c;
            c = a + b;
            System.out.print(a+" ");
        }
    }
}