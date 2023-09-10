package day04_Variables;

import java.util.Scanner;

public class KgToPounds {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter kg: ");

        int kg = myObj.nextInt();
        double lb = kg * 2.2;

        System.out.println("lb =" + lb);
    }
}
