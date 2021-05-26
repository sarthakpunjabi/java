import java.util.Scanner;

class Counter
{
    int count = 0;
    static int counts=0;


    public void IncerementCounter()
    {
        counts++;
        count++;
        System.out.println("The value after incrementing non static count is " +count);
        System.out.println("The value after incrementing static count is " +counts);
    }

    static public void Increments()
    {
        ++counts;
        System.out.println("Now the counts is after static method"+counts);
    }

}

public class StaticMethods{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



            Counter c = new Counter();
            c.IncerementCounter();

            Counter C2 = new Counter();
            C2.IncerementCounter();

        System.out.println(Counter.counts);


    }
}