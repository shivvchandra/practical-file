import java.util.Scanner;
public class P2_Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //takes input of weather
        System.out.println("Input weather (°c): ");
        int weather = sc.nextInt();

        //checks weather and prints results
        if (weather > 30) {
            System.out.println("It is too hot");
        }
        else if (weather < 15) {
            System.out.println("It is too cold");
        }
        else {
            System.out.println("It is pleasant");
        }
    }
}
