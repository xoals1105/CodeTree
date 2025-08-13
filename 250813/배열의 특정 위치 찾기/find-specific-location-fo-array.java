import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[10];

        for(int i = 0; i < 10; i++)
        {
            arr[i] = scanner.nextInt();
        }

        int first_case_sum = 0;
        int second_case_sum = 0;
        int cnt = 0;

        for(int i = 1; i < 10; i+=2)
        {
            first_case_sum += arr[i];
        }

        for(int i = 2; i < 10; i+=3)
        {
            second_case_sum += arr[i];
            cnt++;
        }

        double avg = (double) second_case_sum / cnt;

        System.out.printf("%d %.1f", first_case_sum, avg);

    }
}