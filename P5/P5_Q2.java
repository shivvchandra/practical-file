public class P5_Q2 {
    public static void main(String[] args) {

        //nested for loops to print the pattern
        for (int i = 5; i > 0; i--) {
            for (int o = 1; o < i+1; o++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
