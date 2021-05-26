import java.util.Scanner;
public class MenuDriven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        boolean flag= false;
        int temp,r,n;
        int input = sc.nextInt();
        System.out.println("*** MeNu ***");
        System.out.println("a . Find even or odd ");
        System.out.println("b . Find prime or not");
        System.out.println("c .  FInd Palindrome or not");

        System.out.println("Enter your choice");
        char choice = sc.next().charAt(0);

        switch (choice)
        {
            case 'a':
            case 'A':
                if(input%2==0)
                {
                    System.out.println("This is even number");
                }
                else
                {
                    System.out.println("This is odd number");
                }
                break;
            case 'b':
            case 'B':
                for(int i = 2; i <= input/2; ++i)
                {
                    // condition for nonprime number
                    if(input % i == 0)
                    {
                        flag = true;
                        break;
                    }
                }

                if (!flag)
                    System.out.println(input + " is a prime number.");
                else
                    System.out.println(input + " is not a prime number.");

                break;

            case 'c':
            case 'C':
                int reverse=0;
                temp=input;
                while(temp!=0)
                {
                    r=temp%10;
                    reverse = reverse *10 +r;
                    temp/=10;
                }
                if(reverse==input)
                {
                    System.out.println("The number is palindrome");
                }
                else
                {
                    System.out.println("The number is not palindrome");
                }
                break;

            default:
                System.out.println("Please enter correct option");

        }



    }
}
