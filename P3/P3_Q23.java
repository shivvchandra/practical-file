import java.util.Scanner;
public class P3_Q23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //takes input of number
        System.out.println("Input number: ");
        int n = sc.nextInt();
        int finaln = n;

        //seperates 3rd digit from n
        int x = n % 10;
        n = n - x;
        n = n / 10;

        //seperates 2nd digit from n
        int y = n % 10;
        n = n - y;
        n = n / 10;

        //makes variable of reversed number
        int a = x * 100;
        int b = y * 10;
        int c = n;
        int reversed = a + b + c;

        //checks if reversed is equal to original and prints results
        if (finaln == reversed) {
            System.out.println("Number is palindrome");
        }
        else {
            System.out.println("Number is not palindrome");
        }

    }
}