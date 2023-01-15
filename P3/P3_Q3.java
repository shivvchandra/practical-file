public class P3_Q3 {
    public static void main(String[] args) {
        int i = 1;

        //prints first 10 odd numbers ascending
        while (i < 19) {
            System.out.println(i);
            i++;
            i++;
        }

        //prints first 10 odd numbers descending
        while (i > 0) {
            System.out.println(i);
            i--;
            i--;
        }
    }
}