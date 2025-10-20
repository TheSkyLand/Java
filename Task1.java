import java.util.Scanner;

//Задание1
public class Task1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Input x: ");
        double x = in.nextDouble();

        System.out.print("Input y: ");
        double y = in.nextDouble();

        double t = Math.cos(Math.PI / 7) * Math.pow(Math.sin(x - 8 * y), 2); 
        
        System.out.println(t);
        in.close();

    }
}