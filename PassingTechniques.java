import java.util.Scanner;

class Example{

     protected int f,d,sum;
    protected int add(int a,int b)
    {
        f=a;
        d=b;
        sum =f+d;
        return sum;
    }
    protected void add(Example obj)
    {
        sum = f+d;
    }
}

public class PassingTechniques {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Example obj = new Example();
        Example obj2 = new Example();
        int returned;
        System.out.println("***Menu***");
        System.out.println("a. Call by value " + "\n" +" b. call by reference");
        System.out.println("Enter your choice");
        char choice =  sc.next().charAt(0);
        switch (choice)
        {
            case 'a':
            case 'A':
                System.out.println("Enter the first number ");
                int first = sc.nextInt();

                System.out.println("Enter the second number");
                int second = sc.nextInt();

                 returned = obj.add(first,second);
                System.out.println("The sum by calling value is "+returned);

                break;
            case 'b':
            case 'B':
                System.out.println("Enter the first number ");
                obj2.f= sc.nextInt();

                System.out.println("Enter the second number");
                obj2.d= sc.nextInt();

                obj2.add(obj2);
                System.out.println("the sum by referenced is " + obj2.sum);

            default:
                throw new IllegalStateException("Unexpected value: " + choice);
        }
    }
}




