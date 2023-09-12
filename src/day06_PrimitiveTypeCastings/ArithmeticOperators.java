package day06_PrimitiveTypeCastings;

public class ArithmeticOperators {

    public static void main(String[] args) {

        System.out.println("12"+1); //121
        System.out.println(12+4); // 16
        System.out.println(100-50); // 50
        System.out.println(10 * 9); // 90

        System.out.println(); // Empty Line

        System.out.println(100/3); // 33 (rounded)
        System.out.println(10.0 * 4); // 40.0
        System.out.println(10/4.0); // 2.5
        System.out.println(10d/4.0); // d means decimal


        int a = 100;
        double b = a/6;


        double c = (double)a/6;

        System.out.println();

        System.out.println(b);
        System.out.println(c);
    }

}
