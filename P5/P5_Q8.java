public class P5_Q8 {
    public static void main(String[] args) {

        //nested for loops to print the pattern
        int n = 10;
        for (int i = 1; i < 5; i++) {
            for (int o = 1; o < i+1; o++) {
                System.out.print(n);
                n--;
            }
            System.out.println();
        }
    }
}