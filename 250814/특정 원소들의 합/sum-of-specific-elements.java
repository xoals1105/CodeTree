import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        int[][] arr = new int[4][4];
        int sum = 0;

        for(int i = 0; i < 4; i++)
        {
            for(int j = 0; j < 4; j++)
            {
                arr[i][j] = scanner.nextInt();
            }
        }

        for(int i = 0; i < 4; i++)
        {
            for(int j = 0; j <  i + 1; j++)
            {
                sum += arr[i][j];
            }
        }

        System.out.println(sum);
    }
}