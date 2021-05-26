import java.lang.*;
import java.util.Scanner;

abstract class Homes
{
    protected abstract void doors();
}
class Furniture extends Homes implements Runnable
{

    static int size;

    protected void doors() {
        for(int i = 1 ; i<=size ; i++)
        {
            System.out.println("Every house contains doors");
        }

    }

    @Override
    public void run() {
        doors();
    }
}



public class Multithreading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Runnable r = new Furniture();
        Thread obj = new Thread(r);
        System.out.println("This is starting of the job");

        System.out.println("Enter how many times you want to repeat from printer 1 ");
        int in = sc.nextInt();

        System.out.println("Enter how many times you want to repeat from printer 2");
        Furniture.size=sc.nextInt();
        obj.start();


        for(int i = 1;i<=in;i++)
        {
            System.out.println("This is printer 1 ##");
        }


        System.out.println("This is finishing of the job");

    }
}
