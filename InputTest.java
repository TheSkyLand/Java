import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int sum = 0;

        for(int i = 0; i < 2; i++)
        {
            int b = s.nextInt();

            sum += b;
        }

        System.out.println(sum);
        
    }
}
