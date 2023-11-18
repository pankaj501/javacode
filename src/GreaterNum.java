import java.util.Scanner;

public class GreaterNum {
    public static void main(String[] arg)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter 1st num");
        int x=input.nextInt();
        System.out.println("Enter 2nd num");
        int y=input.nextInt();
        System.out.println("Enter 3rd num");
        int z=input.nextInt();

        if(x<y && x<z)
        {
            System.out.println(x+" is Smaller" );
        } else if (y<z ) {
            System.out.println(y+"  is smaller");
        }
        else
            System.out.println(z+" is smaller");
    }
}
