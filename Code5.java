package ConditionalStmt;

import java.util.Scanner;

public class Code5{
    public static void main(String[] a)
    {
        int passwd;
        System.out.print("Enter your password:");
        Scanner scn = new Scanner(System.in);
        passwd=scn.nextInt();
        if(passwd==1234){
        System.out.println("My Name: Bibek kumar");
        System.out.println("My age: 22");
        System.out.println("My Contact: 783950427s");
        System.out.println("My Address: Somewhere in the world");
        }
    }
}