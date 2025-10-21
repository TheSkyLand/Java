
//Задача 1
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double y;

        double x;

        for (int i = -4; i < 4; i += 0.5) {
            if (i <= 0.5) {
                y = Math.pow(i, 2) - 1;
                System.out.println(y);
                break;
            }
            else if (0 < i && i <= 1.5) {
                y = Math.cos(i);
                System.out.println(y);
                break;
            }
            else if (i > 1.5) {
                y = Math.sin(i - 1);
                System.out.println(y);
                break;
            }
        }

        x = -4;
        while (x < 4) {
            if (x <= 0.5) {
                y = Math.pow(x, 2) - 1;
                System.out.println(y);
                break;
            }
            else if (0 < x && x <= 1.5) {
                y = Math.cos(x);
                System.out.println(y);
                break;
            }
            else if (x > 1.5) {
                y = Math.sin(x - 1);
                System.out.println(y);
                break;
            }
            x += 0.5;
        }

        x = -4;

        do {
            if (x <= 0.5) {
                y = Math.pow(x, 2) - 1;
                System.out.println(y);
                break;
            }
            else if (0 < x && x <= 1.5) {
                y = Math.cos(x);
                System.out.println(y);
                break;
            }
            else if (x > 1.5) {
                y = Math.sin(x - 1);
                System.out.println(y);
                break;
            }
            x += 0.5;
        } while (x < 4);

    }
}
