import java.util.Scanner;
class Students
{
    static int sum;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    String name;
    int age;
    static int size;
    int []marks=new int[size+1];

    public int average()
    {

        return 0;
    }

}
public class ArrayOfObjects
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("how many entries you want ");
        int size = sc.nextInt();
        Students.size = size;
        int sum = 0;
        Students[] st = new Students[size];
        int stuav[] = new int[4];
        for(int i =1;i<=size;i++)
        {
            st[i] = new Students();
            System.out.println("Enter the name of the student ");
            st[i].setName(sc.next());

            System.out.println("Enter the age of the student");
            st[i].setAge(sc.nextInt());

            System.out.println("Enter the marks in hindi eng science out of 100");
            for(int j=1;j<=3;j++)
            {
                st[i].marks[j]=sc.nextInt();
            }
            for(int j=1;j<=3;j++)
            {
                System.out.println(st[i].marks[j]);
            }

        }

        for(int i=1;i<=size;i++)
        {
            for(int j=1;j<=size;j++)
            {
                sum += st[j].marks[i];

            }
            stuav[i]=sum/2;
        }
        System.out.println("Average marks in hindi "+stuav[1]);
        System.out.println("Average marks in english" +stuav[2]);
        System.out.println("Average marks in science" +stuav[3]);
    }

}