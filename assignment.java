package Variables;

import java.util.Scanner;

public class assignment {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for the pyramid: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            int star =2*i-1, space= n-i;
            
            for (int j = 1; j <= space; j++) {
                System.out.print("  ");
            }

            for (int k = 1; k <= star; k++) {
                System.out.print("*"+" ");
            }

            System.out.println();
        }

    }
}