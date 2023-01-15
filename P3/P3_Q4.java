import java.util.Scanner;
public class P3_Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //takes input of number and choice of order
        System.out.println("Input number: ");
        int num = sc.nextInt();
        System.out.println("Type 1 for ascending order and 2 for descending order :");
        int ad = sc.nextInt();
        int i;

        //checks if user wants ascending order or descending order and prints results
        switch(ad) {
            case 1:
                for (i = 1; i < num+1; i++) {
                    System.out.println(i);
                }
                break;
            case 2:
                for (i = num; i > 0; i--) {
                    System.out.println(i);
                }
                break;

        }
    }
}