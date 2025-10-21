
import java.util.Arrays;
import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        
        double b[] = {7.35, 0.12, -7, 3.12, 2.87, -4.12, 5.32, 0, 6.5};

        System.out.println(Arrays.toString(b));
        System.out.println("Максимальное значение - " + getMin(b));
        System.out.println("Максимальное значение - " + getMax(b));
        getMin(b);
        getMin(b);
    }
    public static double getMax(double [] arr){
        double max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }

        return max;
    }
    public static double getMin(double [] arr){
        double min = arr[0];
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i] < min)
            {
                min = arr[i];
            }
        }
        return min;
    }
}
