public class P5_Q5 {
    public static void main(String[] args) {

        //nested for loops to print the pattern
        for (int i = 5; i > 0; i--) {
            for (int o = 5; o > i-1; o--) {
                System.out.print(o);
            }
            System.out.println();
        }
    }
}