import java.util.*;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int num = 1;
        int[][] arr = new int[n][m];

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                arr[i][j] = num;
                num++;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}