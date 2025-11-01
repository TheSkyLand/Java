import java.util.Arrays;
import java.util.Scanner;

public class java6 {
    public static void main(String[] args) {

        int column = 0;

        double a[][] = {
                { 1, 2, 3, 4, 5, },
                { 5, 4, 3, 2, 1, },
                { 2, 3, 4, 5, 6, },
        };
        double b[][] = {};

        for (int i = 0; i < a.length; i++) {
            
            System.out.print(a[i][0]);
            b[i][0] += a[i][0];
            column++;

            System.out.print(" |");
            System.out.print(" ");
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]);
                System.out.print(" ");
            }
            System.out.print('\n');
        }
        
    }
}
