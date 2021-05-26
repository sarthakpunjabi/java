
class Parents
{
    Parents()
    {
        System.out.println("This is the parents");
    }
}
class Childrens extends Parents
{
    Childrens()
    {
        System.out.println("This is the children");
    }
}



class University
{
    University()
    {
        System.out.println("This is university");
    }
}

class college extends University
{
    college()
    {
        System.out.println("THis is college that comes under university");
    }
}

class course extends college
{
    course()
    {
        System.out.println("This is course that comes under college");
    }
}





class human
{
    human()
    {
        System.out.println("This is human the main class");
    }
}
class man extends human
{
    man()
    {
        System.out.println("This is man the subclass of human");
    }
}

class woman extends human
{
    woman()
    {
        System.out.println("This is woman the subclass of human");
    }
}






public class Inheritance {
    public static void main(String[] args) {
        System.out.println("this is single inheritance");
        Childrens child = new Childrens();

        System.out.println("\n\n\n\n\n\nThis is multilevel inheritance");
        course cu = new course();


        System.out.println("\n\n\n\n\nthis is hierarchial inheritance");
        woman w = new woman();
        man m = new man();

    }
}
