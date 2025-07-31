package ConditionalStmt;

import java.util.Scanner;

public class Code15 {
    public static void main(String[] args) {
        int a,b,c,ch;
        System.out.print("Enter any two number:");
        Scanner scn=new Scanner(System.in);

        a=scn.nextInt();
        b=scn.nextInt();
        System.out.println("Enter your choice:");
        ch=scn.nextInt();

        switch(ch)
        {
            case 1: c=a+b;
            System.out.println("addition of first num and second num is "+c);
                break;

            case 2: c=a-b;
            System.out.println("substraction of first num and second num is "+c);
                break;

            case 3: c=a*b;
            System.out.println("multiplication of first num and second num is "+c);
                break;

            case 4: c=a/b;
            System.out.println("division of first num and second num is "+c);
                break;

            case 5: c=a%b;
            System.out.println("remainder of first num and second num is "+c);
                break;

            default:System.out.println("Invalid Choice!please Enter a valid choice.");
        }
    }
}
