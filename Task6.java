
import java.util.Arrays;

public class Task6 {

    public static void main(String[] args) {

        int[][] a = {
            {7, 6, 2},
            {2, 3, 4},
            {1, 2, 3},
            {4, 3, 5},
        };
        int shift = 2;

        System.out.println("Original Array: " + Arrays.toString(a));

        for (int s = 0; s < shift; s++) {
            int temp = a[a.length - 1][a.length - 1];

            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    a[i][j] = a[i - 1][j - 1];
                }
                System.out.println();
            }
            a[0][0] = temp;
        }
        System.out.println("Shifted Array: " + Arrays.toString(a));
    }

}
