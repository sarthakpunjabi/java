public class Prime {
    public static void main(String[] args) {
        int count,c,i=3;
        System.out.println("The first 1000 prime number are");
        System.out.println("2");
        for(count=2;count<=1000;i++)
        {
            for(c=2;c<i;c++)
            {
                if(i%c==0)
                {
                    break;
                }
            }
            if(c==i)
            {
                System.out.println(i);
                count++;
            }
        }
    }
}
