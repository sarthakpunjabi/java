class A
{

    public void show()
    {
        System.out.println("this is in A");
    }
}

class B extends A{


    public void show()
    {

        System.out.println("this is in B");
    }
}

interface D
{
    public  void show();
}

class C extends A implements D{
    public  void show()
    {
        System.out.println("this is in c");
    }
}


public class DynamicMethodDispatch {
    public static void main(String[] args) {
        A obj =new B();
        obj.show();

        obj = new C();
        obj.show();


    }
}
