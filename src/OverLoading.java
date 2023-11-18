import java.util.Scanner;

public class OverLoading {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter your  name");
        String name=scanner.next();
       /* System.out.println("Enter your last name");
        String lastName=scanner.next();*/
        System.out.println("enter your Language");
        String Language=scanner.next();

       /* System.out.println(display(firstName,greeting));
    System.out.println(display(firstName,lastName,greeting));*/
        switch (Language){
            case "french":
                System.out.println("bonjour " + name);
                break;
            case "english":
                System.out.println("Hello"+ name);
                break;
            case "spanish":
                System.out.println("Ola"+ name);
                break;
            case "hindi":
                System.out.println("Namste"+ name);
                break;
            case "Punjabi":
                System.out.println("Sat Sri Akal"+ name);
                break;
            default:
                System.out.println("Language not found");
                break;
        }

    }
    public  static String display(String firstName, String greeting){
        return firstName+ greeting;
    }
    public  static String display(String firstName, String lastName, String greeting){
        return firstName+ lastName + greeting;
    }
}
