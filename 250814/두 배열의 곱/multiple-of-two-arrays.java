import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        int n = 3;
        int product = 1;
        int[][] arr1 = new int[n][n];
        int[][] arr2 = new int[n][n];
        
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                arr1[i][j] = scanner.nextInt();
            }
        }

         for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                arr2[i][j] = scanner.nextInt();
            }
        }
        
         for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                product = arr1[i][j] * arr2[i][j];
                System.out.print(product + " ");
            }
            System.out.println();
        }

    }
}