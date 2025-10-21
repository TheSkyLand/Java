
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input x: ");
        double x = in.nextDouble();

        System.out.print("Input y: ");
        double y = in.nextDouble();

        System.out.print("Input a: ");
        double a = in.nextDouble();

        System.out.print("Input b: ");
        double b = in.nextDouble();

        double MaxValue;
        double MinValue;
        double z;

        if (x < y) {
            MinValue = a - Math.cos(x);
            if (MinValue > (a / b + y)) {
                MinValue = (a / b + y);
            }
            if (MinValue > Math.pow(Math.sin(y), 2)) {
                MinValue = Math.pow(Math.sin(y), 2);
            }
            z = MinValue;
            System.out.println(z);
        }
        if (y <= x && x < y + 5) {
            MaxValue = Math.pow(a, 3);
            if (MaxValue < Math.log(Math.pow(x, 2) + Math.pow(y, 2))) {
                MaxValue = Math.log(Math.pow(x, 2) + Math.pow(y, 2));
            }
            z = MaxValue;
            System.out.println(z);
        }
        if (x >= y + 5) {
            z = a + Math.pow(Math.cos(x - y), 3);
            System.out.println(z);
        }

        in.close();

    }
}
