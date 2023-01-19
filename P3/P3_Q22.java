import java.util.Scanner;
public class P3_Q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //takes input of number
        System.out.println("Input number: ");
        int n = sc.nextInt();

        //seperates 3rd digit from n
        int x = n % 10;
        n = n - x;
        n = n / 10;

        //seperates 2nd digit from n
        int y = n % 10;
        n = n - y;
        n = n / 10;

        //adds 3 digits and prints results
        System.out.println(x+y+n);
    }
}