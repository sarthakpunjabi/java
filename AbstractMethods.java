abstract class Phone
{
    protected abstract String show();
}

class Iphone extends Phone
{
    protected String show()
    {
        return "this is Iphone";
    }
}

class Samsung extends Phone
{
    protected String show()
    {
        return "this is Samsung";
    }
}


public class AbstractMethods
{
    public static void main(String[] args) {
        Phone obj = new Iphone();
        Phone object = new Samsung();

        System.out.println(obj.show());
        System.out.println(object.show());

    }
}
