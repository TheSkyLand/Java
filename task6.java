
public class task6 {

    public static void main(String[] args) {
        // lab7

        double[][] a = new double[][] {
                new double[] { 1, 2, 3, 6, 4, 6 },
                new double[] { 5, 4, 5, 7, 9, 8 },
                new double[] { 5, 4, 5, 7, 9, 8 },
        };
        double b[] = new double[a.length];
        double c[] = new double[a.length];

        int len = a[0].length;
        int firstColumn = 0;
        int lastColumn = len - 1;

        System.out.println("Initiation array");
        System.out.println("----------------");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]);
                System.out.print(" ");
            }
            System.out.print('\n');
        }

        System.out.println("----------------");

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                c[j] = a[j][lastColumn];
                b[j] = a[j][firstColumn];

                a[j][firstColumn] = c[j];
                a[j][lastColumn] = b[j];
            }

            firstColumn++;
            lastColumn--;

        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]);
                System.out.print(" ");
            }
            System.out.print('\n');
        }

    }
}

