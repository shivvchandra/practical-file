import java.util.Scanner;
public class P3_Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //takes input of number
        System.out.println("Input number: ");
        int num = sc.nextInt();

        int i;

        //multiplies number by i and prints results
        for (i = 1; i < 11; i++) {
            System.out.println(num+" * "+i+" = "+num*i);
        }
    }
}