import java.util.Scanner;

public class Calculator {
    public static void main(String[] arg)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter 1st num");
        double x=input.nextDouble();
        System.out.println("Enter 2nd num");
        double y=input.nextDouble();


        System.out.println("Enter 1 for addition ");
        System.out.println("Enter 2 for Subtraction ");
        System.out.println("Enter 3 for Multiplication ");
        System.out.println("Enter 4 for Division ");
        System.out.println("Enter 5 for Modulus ");
        int userInput=input.nextInt();



        switch(userInput) {
        case 1:
            System.out.println( "Sum = "+ addition(x, y));
            break;
        case 2:
            System.out.println( "Subtraction = "+  subtraction(x, y));
            break;
        case 3:
            System.out.println("Multiplication = "+  multiplication(x, y));
            break;

        case 4:
            System.out.println( "Division = "+ division(x, y));
            break;
        case 5:
            System.out.println( "Modulus = "+  modulus(x, y));
            break;
        default:
            System.out.println("Invalid Input");
    }
    }

    public static double addition(double x, double y) {
         return x+y;
    }
    public static double subtraction(double x, double y) {
        return x-y;
    }
    public static double multiplication(double x, double y) {
        return x*y;
    }
    public static double division(double x, double y) {
        return x/y;
    }
    public static double modulus(double x, double y) {
        return x%y;
    }
}


