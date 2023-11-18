import java.text.BreakIterator;
import java.util.Scanner;

public class Switch {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st num");
        double x = input.nextDouble();
        System.out.println("Enter 2nd num");
        double y = input.nextDouble();


        System.out.println("Enter 1 for addition ");
        System.out.println("Enter 2 for Subtraction ");
        System.out.println("Enter 3 for Multiplication ");
        System.out.println("Enter 4 for Division ");
        System.out.println("Enter 5 for Modulus ");
        int userInput = input.nextInt();

        switch(userInput){
            case 1:System.out.println("Addition="+(x+y));
                break;
             case 2:System.out.println("Subtraction="+(x-y));
                break;
                case 3:System.out.println("Multiplication="+(x*y));
                break;
                case 4:System.out.println("Division="+(x/y));
                break;
                case 5:System.out.println("Modulus="+(x%y));
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}
