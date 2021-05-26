
interface Man
{

    public void show();
}

interface women extends Man
{
    public void show();
}

class Human implements Man,women
{

    @Override
    public void show() {
        System.out.println("We are Humans");
    }
}

public class MultipleInterface {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.show();
    }
}
