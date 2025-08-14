import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        int[][] arr = new int[2][4];
        int sum2 = 0;

        for(int i = 0; i < 2; i++)
        {
            for(int j = 0; j < 4; j++)
            {
                arr[i][j] = scanner.nextInt();
            }
        }

        for(int i = 0; i < 2; i++)
        {
            int sum = 0;
            for(int j = 0; j < 4; j++)
            {
                sum += arr[i][j];
                sum2 += arr[i][j]; 
            }
            double avg = (double) sum / 4;
        System.out.printf("%.1f", avg);
        }
        System.out.println();

        for(int i = 0; i < 4; i++)
        {
            int sum1 = 0;
            for(int j = 0; j < 2; j++)
            {
                sum1 += arr[j][i];
            }
            double avg = (double) sum1 / 2;
        System.out.printf("%.1f", avg);
        }
        System.out.println();

        double avg = (double) sum2 / 8;
        System.out.printf("%.1f", avg);
    }
}