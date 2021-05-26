import java.lang.reflect.Array;
import java.util.Scanner;
public class MenuDrivenTwo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int input,size,search,temp;
        boolean flag= true;
        System.out.println("a . Search and Sort\n" +
                "b. Perform addition and multiplication of matrices.\n" +
                "c . Find transpose of the entered matrix");
        char choiceOne = sc.next().charAt(0);
        switch (choiceOne)
        {
            case 'a':
            case 'A':
                System.out.println("Enter the count you want to enter ");
                size= sc.nextInt();

                int arr[] = new int[size];
                System.out.println("Enter the numbers in the array ");
                for(int i =0;i<arr.length;i++)
                {
                    arr[i]=sc.nextInt();
                }
                System.out.println("for ascending press 1 ");
                input=sc.nextInt();

                if(input==1)
                {
                    for(int i=0;i<arr.length-1;i++)
                    {
                        for(int j=0;j<arr.length-i-1;j++)
                        {
                            if(arr[j]>arr[j+1])
                            {
                                temp=arr[j];
                                arr[j]= arr[j+1];
                                arr[j+1]=temp;
                            }
                        }
                    }
                }
                else
                {
                    for(int i=0;i<arr.length-1;i++)
                    {
                        for(int j=0;j<arr.length-i-1;j++)
                        {
                            if(arr[j]<arr[j+1])
                            {
                                temp=arr[j];
                                arr[j]= arr[j+1];
                                arr[j+1]=temp;
                            }
                        }
                    }
                }
                for (int i:arr) {
                    System.out.println(i);

                }

                System.out.println("Enter the element you want to find in the given numbers");
                search=sc.nextInt();

                for(int i=0;i<arr.length;i++)
                {
                    if(search==i)
                    {
                        System.out.println("the number is at location" + i);
                        flag=false;
                    }

                }
                if (flag==true)
                {
                    System.out.println("Number is not provided in the given index");
                }
                break;

            case 'b':
            case 'B':
                System.out.println("Enter rows and columns for the first matrix");
                int row1=sc.nextInt();
                int col1=sc.nextInt();
                int arr1[][]= new int[row1][col1];
                System.out.println("Enter the entries in the first matrix");
                for(int i=0;i<row1;i++)
                    for(int j=0;j<col1;j++)
                        arr1[i][j]=sc.nextInt();

                System.out.println("Enter rows and columns for the second matrix");
                int row2=sc.nextInt();
                int col2=sc.nextInt();
                int arr2[][]= new int[row2][col2];
                System.out.println("Enter the entries in the second matrix");
                for(int i=0;i<row1;i++)
                    for(int j=0;j<col1;j++)
                        arr2[i][j]=sc.nextInt();




                if(row1==row2 && col1==col2)
                {
                    int addition[][]=new int[row1][col2];
                    int multiplication[][]=new int[row1][col2];
                    for(int i=0;i<row1;i++)
                        for(int j=0;j<col1;j++)
                            addition[i][j]=arr1[i][j]+arr2[i][j];

                    System.out.println("The addition of the matrix is ");
                    for(int[] s1:addition)
                    {
                        for (int val:s1
                             ) {
                            System.out.print(val);
                        }
                        System.out.println();
                    }

                    System.out.println("multiplication of matrix is: ");

                    for(int i=0;i<row1;i++)
                    {
                        for(int j=0;j<col1;j++)
                        {
                            multiplication[i][j]=0;

                            for(int k=0;k<row1;k++)
                            {
                                multiplication[i][j]=arr1[i][k]*arr2[k][i];
                            }
                        }
                    }
                    for(int[] s1:multiplication)
                    {
                        for (int val:s1
                        ) {
                            System.out.print(val);
                        }
                        System.out.println();
                    }
                }
                break;

            case 'c':
            case 'C':
                System.out.println("Enter rows and columns for the first matrix");
                int r1=sc.nextInt();
                int c1=sc.nextInt();
                int arrr1[][]= new int[r1][c1];
                int transpose[][]= new int[r1][c1];
                System.out.println("Enter the entries in the first matrix");
                for(int i=0;i<r1;i++)
                    for(int j=0;j<c1;j++)
                        arrr1[i][j]=sc.nextInt();

                for(int i =0;i<r1;i++)
                {
                    for(int j =0;j<c1;j++)
                    {
                        transpose[j][i]=arrr1[i][j];
                    }
                }

                for (int []tem:transpose
                     ) {

                    for (int val:tem
                         ) {
                        System.out.print(val);

                    }
                    System.out.println();
                }
            break;
            default:
                System.out.println("please enter correct information");
        }
    }
}
