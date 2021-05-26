import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fact=1;
        System.out.println(" Enter the number for the factorial ");
        int input = sc.nextInt();

        for(int i=input;i>=1;i--)
        {
            fact *=i;
        }
        System.out.println("The factorial of the given number  " + input + " is " + fact);
    }
}
