public class P3_Q2 {
    public static void main(String[] args) {
        int i = 2;

        //prints first 10 even numbers ascending
        while (i < 20) {
            System.out.println(i);
            i++;
            i++;
        }

        //prints first 10 even numbers descending
        while (i > 0) {
            System.out.println(i);
            i--;
            i--;
        }
    }
}