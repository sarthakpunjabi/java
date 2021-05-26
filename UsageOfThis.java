import java.util.Scanner;


class Examples
{
    private int x;

    protected void val(int x)
    {

        this.x=x;
    }
    protected void setter()
    {
        System.out.println("The value of x is"+this.x);
    }

}

public class UsageOfThis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Examples object = new Examples();
        System.out.println("Enter any number you want to pass");
        int input = sc.nextInt();
        object.val(input);
        object.setter();
    }
}
