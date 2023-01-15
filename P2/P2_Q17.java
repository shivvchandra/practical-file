import java.util.Scanner;
public class P2_Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //takes input of letter
        System.out.print("Enter the first letter of a color of the rainbow: ");
        String letter = sc.next();

        //checks corresponding color and prints result
        switch (letter) {
            case "V":
            case "v":
                System.out.println("Violet");
                break;
            case "I":
            case "i":
                System.out.println("Indigo");
                break;
            case "B":
            case "b":
                System.out.println("Blue");
                break;
            case "G":
            case "g":
                System.out.println("Green");
                break;
            case "Y":
            case "y":
                System.out.println("Yellow");
                break;
            case "O":
            case "o":
                System.out.println("Orange");
                break;
            case "R":
            case "r":
                System.out.println("Red");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}
