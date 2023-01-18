import java.util.Scanner;
public class P3_Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int min = 0;
        int max = 0;
        int first = 1;

        //takes input of numbers
        for (int i = 0; i < 10; i++) {
            System.out.print("Input number: ");
            num = sc.nextInt();

            //sets value of min and max to input
            if (first == 1) {
                min = num;
                max = num;
                first = 0;
            }

            //compares input with the min and max
            else {
                if (num < min) {
                    min = num;
                }
                else if (num > max) {
                    max = num;
                }
            }
        }
        //prints results
        System.out.println("Smallest: " + min);
        System.out.println("Greatest: " + max);
    }
}