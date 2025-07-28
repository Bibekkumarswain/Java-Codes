package ConditionalStmt;

import java.util.Scanner;

public class Code9{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter two number:");

        int firstNum = scn.nextInt();
        int SecondNum = scn.nextInt();
        if(firstNum>SecondNum){
            System.out.println("first number is bigger than second");
        }
        else if(SecondNum>firstNum){
            System.out.println("second number is bigger than first");
        }
        else{
            System.out.println("Entered number are equal.");
        }
    }
}