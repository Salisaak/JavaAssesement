package one2eight;

import java.util.Scanner;

public class Main {

    static String firstName = "Saahir";
    static String lastName = "Salis";                       //#1
    static String fullName = firstName + " " + lastName;
    //--------------------------------------------------------------------------------

    public static double questiontwo(double num1, double num2){                 //#2
        double numfin = num1 / num2;

        return numfin;
    };
    //--------------------------------------------------------------------------------------
    public static void question7(int ting) {
        if (ting % 3 == 0 && ting % 5 == 0) {
            System.out.println("YearUp");
        }                                                           //#7
        else if (ting % 5 == 0) {
            System.out.println("Year");
        }
        else if (ting % 3 == 0) {
                System.out.println("Up");
        }

    }

    public static void main(String[] args) {

        System.out.println(fullName);
        //------------------------------------------
        System.out.println(questiontwo(118,31));
        //-----------------------------------------------------------------------------#3
        String[] leNames = {"Samuel L Jackson", "Yoko Taro", "Eric Kelso"};
        for (String iD:leNames){
            System.out.println(iD);
        }
        Scanner leScanner = new Scanner((System.in));
        //----------------------------------------------------------------#4
        System.out.println("whats your lucky number?");
        double lucky = leScanner.nextDouble();
        System.out.println("whats your name?");
        String name = leScanner.next();

        System.out.println("Hey "+ name+ " your lucky number is "+lucky);
        //----------------------------------------------------------------------------#5
        Person John = new Person("Yjol D.",29);
        System.out.println(John);


        question7(3);


    }

}
