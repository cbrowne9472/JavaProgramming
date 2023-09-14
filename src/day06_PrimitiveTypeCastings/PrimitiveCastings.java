package day06_PrimitiveTypeCastings;

public class PrimitiveCastings {

    public static void main(String[] args) {

        byte a = 127;
        short b = a;

        System.out.println(a);
        System.out.println();
        System.out.println(b);


        int c = b;

        System.out.println(c);

        long d = c;

        System.out.println(d);

        float e = d;

        System.out.println(e);
        double f = e;

        System.out.println(f);

        System.out.println("---------------------------");

        int x = 55;

        short y = (short)x;

        System.out.println(x + " : " + y);






    }

}


