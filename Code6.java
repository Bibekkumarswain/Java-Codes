package ConditionalStmt;

import java.util.Scanner;

public class Code6{
    public static void main(String [] a){
        int password;
        System.out.print("Enter your password:");
        Scanner scn=new Scanner(System.in);
        password=scn.nextInt();

        if(password==1234){
            System.out.println("My Name: Bibek kumar");
        System.out.println("My age: 22");
        System.out.println("My Contact: 783950427s");
        System.out.println("My Address: Somewhere in the world");
        }
        else{
            System.out.println("You entered a wrong password!please try again...");
        }
    }
}