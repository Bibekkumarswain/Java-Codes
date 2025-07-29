package ConditionalStmt;

import java.util.Scanner;

public class Code11 {
    public static void main(String[] a)
    {
        int num;
        System.out.print("Enter any number:");
        Scanner scn=new Scanner(System.in);
        num=scn.nextInt();

        while(num>=0){
            if(num%2==0){
                System.out.println("Even Number");
                break;
            }
            else{
                System.out.println("Odd Number");
                break;
            }
        }
    }
}
