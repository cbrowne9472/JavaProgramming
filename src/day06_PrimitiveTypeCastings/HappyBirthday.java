package day06_PrimitiveTypeCastings;

import java.time.LocalDate;

public class HappyBirthday {

    public static void main(String[] args) {

        happyBirthDay(1990, 6, 15);

    }

    public static void happyBirthDay(int year, int month, int day) {

        LocalDate birthday = LocalDate.of(year, month, day);
        LocalDate today = LocalDate.now();

//        int month2 = today.getMonthValue();
//        int day2 = today.getDayOfMonth();

        int month2 = 6;
        int day2 = 15;

        if(month2 == month && day2 == day){
            System.out.println("Today is your birthday!!!");
            System.out.println("   \n \t \t  \t \t    * * * * * * * * * * * * * * * * * * * * *");
            System.out.println("   \t \t  \t \t  *  * * * * * * * * * * * * * * * * * * * *  * ");
            System.out.println("  \t \t  \t \t *  *                                       *  * ");
            System.out.println(" \t \t  \t \t*  *          Happy BirthDay To You!         *  * ");
            System.out.println("  \t \t  \t \t *  *                                       *  * ");
            System.out.println("  \t \t   \t \t  *  * * * * * * * * * * * * * * * * * * * *  * ");
            System.out.println("   \t \t   \t \t    * * * * * * * * * * * * * * * * * * * * *");
            return;
        }


    }


}
