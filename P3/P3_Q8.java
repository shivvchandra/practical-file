import java.util.Scanner;
public class P3_Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //takes input of number
        System.out.println("Input number: ");
        int num = sc.nextInt();
        System.out.print("Input number to print multiples till: ");
        int x = sc.nextInt();

        int i;

        //multiplies number by i, repeats till specified, and prints results
        for (i = 1; i < x+1; i++) {
            System.out.println(num*i);
        }
    }
}