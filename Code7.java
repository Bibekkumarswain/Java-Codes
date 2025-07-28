package ConditionalStmt;

import java.util.Scanner;

public class Code7 {
    public static void main(String[] a){
        int age;
        System.out.print("Enter your age:");
        Scanner scn = new Scanner(System.in);
        age=scn.nextInt();
        if(age>=18){
            System.out.println("You are eligiable for voting.");
        } 
        else{
            System.out.println("Sorry you are not eligible for voting.");
        }

    }
}
