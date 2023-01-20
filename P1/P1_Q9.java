class P1_Q9 {
    public static void main(String[] args) {

        //converts fahrenheit to celsius and prints results
        double fahrenheit = 100;
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println(fahrenheit + "F = " + celsius + "C");

        //converts celsius to fahrenheit and prints results
        celsius = 100;
        fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println(celsius + "C = " + fahrenheit + "F");
    }
}