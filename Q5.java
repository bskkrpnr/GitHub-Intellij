package homework;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a= input.nextInt();
        System.out.println("Enter the second number:");
        int b= input.nextInt();

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping:");
        System.out.println("a= "+a);
        System.out.println("b= "+b);
    }
}
