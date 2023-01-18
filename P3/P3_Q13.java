import java.util.Scanner;
public class P3_Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //takes input of two numbers
        System.out.println("Input first number: ");
        int a = sc.nextInt();
        System.out.println("Input second number: ");
        int b = sc.nextInt();

        //checks the largest number with which a and b are divisible
        int hcf = 0;
        for (int i = 1; i <= a || i <= b; i++) {
            if (a%i == 0 && b%i == 0)
                hcf = i;
        }

        //prints results
        System.out.println("HCF: "+hcf);
    }
}