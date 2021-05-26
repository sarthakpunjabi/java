import java.util.Scanner;
class Ex
{
    static int input=1;

    protected int show(int input)
    {
        this.input +=input;
        return this.input;
    }
}

public class ThisKey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ex obj = new Ex();
        System.out.println("Enter any number to add to 1");
        int input = sc.nextInt();
        System.out.println("After incrementing "+obj.show(input));
    }
}
