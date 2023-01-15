import java.util.Scanner;
public class P2_Q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //takes input of 2 numbers
        System.out.print("Input first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Input second number: ");
        double num2 = sc.nextDouble();

        //takes input of operators
        System.out.print("Input operator (+, -, *, /, %): ");
        String operator = sc.next();

        //checks operator and prints result
        switch (operator) {
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            case "/":
                System.out.println(num1 / num2);
                break;
            case "%":
                System.out.println(num1 % num2);
                break;
            default:
                System.out.println("Invalid operator input.");
                break;
        }
    }
}
