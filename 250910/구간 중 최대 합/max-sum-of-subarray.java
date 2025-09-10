import java.util.Scanner;
public class Main {

    public static final int INT_MIN = Integer.MIN_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
    
        int answer = INT_MIN;
        for(int i = 0; i < n - k; i++)
        {
            int sum = 0;
            for(int j = i; j < i + k; j++)
            {
                sum += arr[j];
            }
            answer = Math.max(answer, sum);
        }

        System.out.println(answer);
    }
}