import java.util.Scanner;

class task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();


        int[] arr = new int[1];


            for (int i = 0; a > 0; i++)
            {
                a = a % 2;
                
                arr[i] = a;
                System.out.println(a);
            }

            for (int i = 0; i < arr.length; i++)
            {
                System.out.println(arr[i]);
            }
                
                
                

        

        sc.close();
    }
}
