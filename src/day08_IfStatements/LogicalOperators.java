package day08_IfStatements;

public class LogicalOperators {

    public static void main(String[] args) {

        String name = "Chris";
        int age = 19;
        String citizen = "UK";

        boolean isEligible = age>= 18 && citizen == "USA";

        System.out.println(name + " is eligible to vote: " +isEligible);

        System.out.println("-----------------------------------");

        String name2 = "Josh";

        int creditScore = 800;
        int age2 = 42;
        int income = 40000;

        boolean isEligible2 = creditScore >= 700 && age2 >= 21 && income >= 60000;

        System.out.println(name2+" is eligible for loan: "+isEligible2);
        System.out.println("-----------------------------");

        String name3 = "Tom";

        int coolness = 61;
        int age3 = 18;

        boolean isEligible3 = coolness >= 18 && coolness <=60;

        if (isEligible3){
            System.out.println(name3 + " is cool, his score is " + coolness + " and his age is " + age3);
        }
        else{
            System.out.println(name3 + " is not cool");
        }

        System.out.println("------------------------------");

    }

}
