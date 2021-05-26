import  java.util.Scanner;

class Rooms{
    Scanner sc = new Scanner(System.in);

    private int length,breadth, height,arr,pr,vr;
    protected void get()
    {
        System.out.println("Enter the length ");
        length = sc.nextInt();

        System.out.println("Enter the breadth ");;
        breadth = sc.nextInt();

        System.out.println("Enter the height");
        height = sc.nextInt();
    }

    protected void area()
    {
        arr=length*breadth;
    }

    protected void perimeter()
    {
        pr=(2*length)+(2*breadth);
    }

    protected void volume()
    {
        vr = length*breadth*height;
    }

    protected void display()
    {
        System.out.println("Area of the room is "+arr);
        System.out.println("Perimeter of the room is "+pr);
        System.out.println("Volume of the room is "+vr);
    }


}

public class Room {
    public static void main(String[] args) {
            Rooms obj1 = new Rooms();
        Rooms obj2 = new Rooms();
        Rooms obj3 = new Rooms();

        obj1.get();
        obj1.area();
        obj1.perimeter();
        obj1.volume();
        obj1.display();

        obj2.get();
        obj2.area();
        obj2.perimeter();
        obj2.volume();
        obj2.display();

        obj3.get();
        obj3.area();
        obj3.perimeter();
        obj3.volume();
        obj3.display();

    }
}
