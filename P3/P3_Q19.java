public class P3_Q19 {
    public static void main(String[] args) {
        int i;

        //checks if i is divisble by 7 and prints results
        for (i = 51; i < 502; i++) {
            if (i % 7 == 0) {
                System.out.print(i+" ");
            }
            else {
                continue;
            }
        }
    }
}
