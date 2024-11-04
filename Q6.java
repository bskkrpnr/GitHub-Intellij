package homework;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number= input.nextInt();
        boolean flag=false;
        if (number==0||number==1){
        flag=true;
       }
       for (int i=2;i<=number/2;++i){
           if(number %i==0){
               flag=true;
               break;
           }
       }
       if(!flag){
           System.out.println(number+" is a prime number");
       } else {
           System.out.println(number+ " is not a prime number");
       }
    }
}

