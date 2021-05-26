public class Fibonacci {
    public static void main(String[] args) {
        int t1=0,t2=1,sum=0,count=1000;

        for(int i=1;i<=count;i++)
        {
            System.out.print(t1+"\t");
            sum=t1+t2;
            t1=t2;
            t2=sum;

        }

    }
}
