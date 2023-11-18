import java.util.Scanner;

public class LoopPractice {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int userInput=0;
        System.out.println("enter 5 Numbers");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter "+i+" number");
            userInput=input.nextInt();
            if(userInput%3==0) {
                System.out.println("Exiting loop");
                break;
            }
        }
    }
}
