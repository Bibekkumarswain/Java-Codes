//Simple example of for-loop
package ConditionalStmt;

import java.util.Scanner;

public class Code10 {
    public static void main(String[] a)
    {
        int num;
        System.out.print("Enter any number:");
        Scanner scn=new Scanner(System.in);
        num=scn.nextInt();

        for(int i=1;i<=10;i++){
            System.out.println(num*i);
        }
    }
}
