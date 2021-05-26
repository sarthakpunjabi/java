import SamplePackage.*;
import SamplePackage.Packs;

import java.util.Scanner;

public class Packaging {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Packs p = new Packs();

        System.out.println("Enter first number");
        int inputOne = sc.nextInt();

        System.out.println("Enter second number");
        int inputTwo = sc.nextInt();

        System.out.println("The addition is "+p.add(inputOne,inputTwo));
        System.out.println("The multiplication is"+p.mul(inputOne,inputTwo));
        System.out.println("The Division is"+p.div(inputOne,inputTwo));
        System.out.println("The subtraction is "+p.sub(inputOne,inputTwo));


    }
}
