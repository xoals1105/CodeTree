import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] arr = new int[n][n];

        for(int location = 0; location < m; location++)
        {
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            arr[row -1][col - 1] = 1;         
        }

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}