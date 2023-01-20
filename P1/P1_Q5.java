public class P1_Q5 {
    public static void main(String[] args) {

        //defining the variable
        int a = 3;
        int b = 4;

        //swapping value
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("A = "+ a);
        System.out.println("B = "+ b);

    }
}
