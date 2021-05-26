import java.util.Scanner;

class Student
{
    Student()
    {

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    String name;
    int age;

    public void setMarks(int marks) {
        Marks = marks;
    }

    int Marks;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }


    Student(String name,int age)
    {
            this.name=name;
            this.age=age;

    }

    Student(Student ref)
    {
        this.name=ref.name;
        this.age=ref.age;
    }


}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();
        System.out.println("Enter the name of the student");
        s1.setName(sc.next());
        String name = s1.getName();
        System.out.println("Enter the age of the students");
        s1.setAge(sc.nextInt());
        int age = s1.getAge();

        Student s2 = new Student(name,age);
        Student s3 = new Student(s2);

        System.out.println("Members of second object is ");
        System.out.println(s2.getName());

        System.out.println(s2.getAge());

        System.out.println("Members of third object is");
        System.out.println(s3.getName());
        System.out.println(s3.getAge());










    }
}
