import java.util.Scanner;

public class IvrSystem {
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);
        System.out.println("Welcome to Rogers Support.");
        System.out.println("Press 1 for English Menu ");
        System.out.println("Press 2 for French Menu ");
        int languageInput = getInput.nextInt();
        int subMenu = 0;
        if (languageInput == 1) {
            System.out.println("Press 1 for Mobile");
            System.out.println("Press 2 for Internet");
            System.out.println("Press 3 for TV");
            System.out.println("Press 4 for Customer Support");
            // System.out.println("Press 5 for Customer Support");
            int menuInput = getInput.nextInt();
            switch (menuInput) {
                case 1:
                    System.out.println("Press 1 for Billing");
                    System.out.println("Press 2 for Tech Support");
                    System.out.println("Press 3 for Cancellation");
                    subMenu = getInput.nextInt();
                    if (subMenu == 1)
                        System.out.println("Welcome to mobile support");
                    else if (subMenu == 2)
                        System.out.println("Welcome to tech support");
                    else if (subMenu == 3)
                        System.out.println("Welcome to Cancellation");
                    else
                        System.out.println("Invalid input");
                    break;
                case 2:
                    System.out.println("Press 1 for Billing");
                    System.out.println("Press 2 for Tech Support");
                    System.out.println("Press 3 for Cancellation");
                    subMenu = getInput.nextInt();
                    if (subMenu == 1)
                        System.out.println("Welcome to mobile support");
                    else if (subMenu == 2)
                        System.out.println("Welcome to tech support");
                    else if (subMenu == 3)
                        System.out.println("Welcome to Cancellation");
                    else
                        System.out.println("Invalid input");
                    break;
                case 3:
                    System.out.println("Press 1 for Billing");
                    System.out.println("Press 2 for Tech Support");
                    System.out.println("Press 3 for Cancellation");
                    subMenu = getInput.nextInt();
                    if (subMenu == 1)
                        System.out.println("Welcome to mobile support");
                    else if (subMenu == 2)
                        System.out.println("Welcome to tech support");
                    else if (subMenu == 3)
                        System.out.println("Welcome to Cancellation");
                    else
                        System.out.println("Invalid input");
                    break;
                case 4:
                    System.out.println("Press 1 for Billing");
                    System.out.println("Press 2 for Tech Support");
                    System.out.println("Press 3 for Cancellation");
                    subMenu = getInput.nextInt();
                    if (subMenu == 1)
                        System.out.println("Welcome to mobile support");
                    else if (subMenu == 2)
                        System.out.println("Welcome to tech support");
                    else if (subMenu == 3)
                        System.out.println("Welcome to Cancellation");
                    else
                        System.out.println("Invalid input");
                    break;

                default:
                    System.out.println("Invalid input");
            }


        } else  if (languageInput == 2) {
            System.out.println("Wlecome to french menu");
        }
        else
            System.out.println("invalid input");
    }

}


