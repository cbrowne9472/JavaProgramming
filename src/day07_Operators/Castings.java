package day07_Operators;

public class Castings {

    public static void main(String[] args) {

        float averageScore = 20.5f;

        byte num1 = (byte)averageScore;
        short num2 = (short) averageScore;
        int num3 = (int) averageScore;
        float num4 = averageScore;
        double num5 = averageScore;
        long num6 = (long) averageScore;

        System.out.println(num1 + " " + num2 + " " +  num3 + " " + num4 + " " + num5 + " " + num6);

    }

}
