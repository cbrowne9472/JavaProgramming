package day03_EscpaeSequences;

public class PrintLn_VS_Print {

    public static void main(String[] args){

        System.out.println("Knock Knock");
        System.out.println("Who is this?");
        System.out.println("This is Java");

        System.out.println("------------------------------");

        System.out.print("Knock Knock"); // prints Knock Knock, does not append new line
        System.out.print("Who is this?");
        System.out.print("This is Java");

        System.out.println();
        System.out.println("-----------------------------------");

        System.out.println("Hello everyone, how are you all today? Today we will learn Escape Sequences, and next week we will learn Variables");

        System.out.println("----------------------------------");

        System.out.print("Hello Everyone, How are you all today? ");
        System.out.print("Today we will learn Escape Sequences, ");
        System.out.print(", and next week we will learn Variables");


    }

}
