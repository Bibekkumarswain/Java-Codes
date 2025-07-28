//Write a java program to check a number is odd or even//
package ConditionalStmt;

import java.util.Scanner;

public class Code8 {
    public static void main(String[] a){
        System.out.print("Enter a number:");
        Scanner scn = new Scanner(System.in);
    
        int n=scn.nextInt();

        if(n%2==0){
            System.out.println("entered number is a even number.");
        }
        else{
            System.out.println("entered number is a odd number.");
        }
    }
}
