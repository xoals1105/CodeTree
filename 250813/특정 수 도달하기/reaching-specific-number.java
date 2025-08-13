import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[10];
        int sum = 0;
        int cnt = 0;

        for(int current_num = 0; current_num < 10; current_num++)
        {
            arr[current_num] = scanner.nextInt();
        }

        for(int current_num = 0; current_num < 10; current_num++)
        {
            if(arr[current_num] >= 250) break;
            sum += arr[current_num];
            cnt++;
                
        }   

        double avg = (double) sum / cnt;
        System.out.printf("%d %.1f", sum, avg);
    }
}