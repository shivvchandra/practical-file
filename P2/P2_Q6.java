import java.util.Scanner;
public class P2_Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //takes input of char
        System.out.print("Input a character: ");
        char ch = sc.next().charAt(0);

        //checks what type of char it is
        if (Character.isLetter(ch)) {
            System.out.println(ch + " is a letter");
        } else if (Character.isDigit(ch)) {
            System.out.println(ch + " is a digit");
        } else {
            System.out.println(ch + " is a special character");
        }
    }
}
