
public class task6 {

    public static void main(String[] args) {
        // lab7

        double a[][] = {
                { 1, 2, 4, 6 },
                { 5, 4, 9, 8 }
        };
        double b[] = new double[a.length];
        double c[] = new double[a.length];

        int lenx = 3;
        int leny = 2;

        int firstColumn = 0;
        int lastColumn = a.length;

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

        for (int i = 0; i < 3; i++) {
            c[i] = a[i][lastColumn];
            b[i] = a[i][firstColumn];

            a[i][firstColumn] = c[i];
            a[i][lastColumn] = b[i];


            System.out.print(a[i][0]);
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
