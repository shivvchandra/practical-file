import java.util.Scanner;
public class P2_Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //takes input for breadth of rectangle
        System.out.print("Input the length of the rectangle: ");
        int length = sc.nextInt();

        //takes input for breadth of rectangle
        System.out.print("Input the breadth of the rectangle: ");
        int breadth = sc.nextInt();

        //checks if the length and breadth are equal
        if (length == breadth) {
            System.out.println("The rectangle is a square");
        } else {
            System.out.println("The rectangle is not a square");
        }
    }
}