
import java.util.Scanner;

public class Task4 {

    public static double Tangens(double a, double b, double c, double p) {
        double t = Math.sqrt((p - a) * (p - b) / p * (p - c));
        double result = Math.tan(t / 2);
        return (result);
    }

    public static double Perimeter(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return p;
    }

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Input a: ");
        double a = in.nextDouble();

        System.out.print("Input b: ");
        double b = in.nextDouble();

        System.out.print("Input c: ");
        double c = in.nextDouble();

        System.out.println(Perimeter(a, b, c));
        System.out.println(Tangens(a, b, c, Perimeter(a, b, c)));
    }
}
