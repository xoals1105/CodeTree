import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] arr = new String[n];
        int cnt = 0;
        int sum = 0;

        for(int i = 0; i < n; i++)
        {
            arr[i] = scanner.next();
        }

        char c = scanner.next().charAt(0);

        for(int i = 0; i < n; i++)
        {
            if(arr[i].charAt(0) == c)
            {
                sum += arr[i].length();
                cnt++;
            }
        }

        double avg = (double) sum / cnt;

        System.out.printf("%d %.2f", cnt, avg);
    }
}