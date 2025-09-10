import java.util.Scanner;

public class Main {

    public static final int INT_MAX = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for(int i = 0; i < n; i++)
            sum += arr[i];
        int answer = INT_MAX;
        for(int i = 0; i < n; i++)
        {
            int sum1 = 0;
            for(int j = i + 1; j < n; j++)
            {   
                sum1 = sum - (arr[i] + arr[j]);
                int diff = Math.abs(s - sum1);
                answer = Math.min(answer, diff);
            }
        }

        System.out.println(answer);
    }
}