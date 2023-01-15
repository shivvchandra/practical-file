import java.util.Scanner;
public class P2_Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //takes input of letter and makes it into a char
        System.out.print("Input a letter: ");
        String in = sc.next();
        char l = in.charAt(0);

        //checks if the letter is lowercase or uppercase
        if (l >= 'a' && l <= 'z') {
            System.out.println("The letter is lowercase");
        } else if (l >= 'A' && l <= 'Z') {
            System.out.println("The letter is uppercase");
        } else {
            System.out.println("The input is not a letter");
        }
    }
}
