package Variables;

import java.util.Scanner;

public class Code4 {
    public static void main(String[] args) {
        int firstNum, secNum, thirdNum;
        System.out.println("Enter any Two Number for addition");
        Scanner s=new Scanner(System.in);

        System.out.print("Enter the first number:");
        firstNum=s.nextInt(); 

        System.out.print("Enter the second number:");
        secNum=s.nextInt();

        thirdNum=firstNum +secNum;
        System.out.println("Sum of two numbers:"+thirdNum);
    }
}
