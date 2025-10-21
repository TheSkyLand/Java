import java.util.Scanner;

//Задание29
public class Task1new {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Input x: ");
        double x = in.nextDouble();

        System.out.print("Input y: ");
        double y = in.nextDouble();

        double t = ((x - y) / Math.sqrt(x + y)) + (x * Math.pow(y, 2)) / Math.sin(Math.pow(y, 2)) * Math.pow(Math.cos(y), 2) ; 
        
        System.out.println(t);
        in.close();

    }
}