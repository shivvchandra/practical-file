import java.util.Scanner;
class P1_Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //takes input of amount of money
        System.out.println("Input amount: ");
        int n = sc.nextInt();

        //calculates how many notes needed
        int twoThousandNotes = n / 2000;
        n = n - twoThousandNotes * 2000;
        int fiveHundredNotes = n / 500;
        n = n - fiveHundredNotes * 500;
        int twoHundredNotes = n / 200;
        n = n - twoHundredNotes * 200;
        int hundredNotes = n / 100;
        n = n - hundredNotes * 100;
        int fiftyNotes = n / 50;
        n = n - fiftyNotes * 50;
        int twentyNotes = n / 20;
        n = n - twentyNotes * 20;
        int tenNotes = n / 10;
        n = n - tenNotes * 10;
        int fiveNotes = n / 5;
        n = n - fiveNotes * 5;
        int twoNotes = n / 2;
        n = n - twoNotes * 2;
        int oneNotes = n;

        //prints results
        System.out.println("₹2000 notes: " + twoThousandNotes);
        System.out.println("₹500 notes: " + fiveHundredNotes);
        System.out.println("₹200 notes: " + twoHundredNotes);
        System.out.println("₹100 notes: " + hundredNotes);
        System.out.println("₹50 notes: " + fiftyNotes);
        System.out.println("₹20 notes: " + twentyNotes);
        System.out.println("₹10 notes: " + tenNotes);
        System.out.println("₹5 notes: " + fiveNotes);
        System.out.println("₹2 notes: " + twoNotes);
        System.out.println("₹1 notes: " + oneNotes);
    }
}