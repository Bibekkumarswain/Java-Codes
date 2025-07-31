//Write a program to check a number is even or odd
package ConditionalStmt;

import java.util.Scanner;

public class Code12 {
    public static void main(String[] a){
        
        int num;
        System.out.print("Enter a number:");
        Scanner scn = new Scanner(System.in);

        num = scn.nextInt();
        while(num>=0){
            if(num%2==0){
                System.out.println("Even number");
                break;
            }
            else{
                System.out.println("odd number");
                break;
            }
        }
    }
}
