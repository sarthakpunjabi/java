import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input,temp,count=0,sum=0;
        boolean forward=true;

        while(forward)
        {
            System.out.println("Enter any 4 digit number");
            input=sc.nextInt();
            temp=input;
            while(temp!=0)
            {
                temp/=10;
                ++count;


            }
            if(count==4)
            {
                while(input!=0)
                {
                    temp=input%10;
                    sum+=temp;
                    input/=10;

                }
                System.out.println("The sum of the numbers are "+sum);
                break;
            }
            System.out.println("Please enter 4 digit number");
            count=0;

        }


    }
}
