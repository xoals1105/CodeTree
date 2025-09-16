import java.util.Scanner;

public class Main {

    public static final int INT_MIN = Integer.MIN_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    
        int answer = INT_MIN;

        for(int i = 1; i <= 100; i++)
        {
            int cnt = 0;
            for(int j = 0; j < n; j++)
                for(int k = j + 1; k < n; k++)
                {
                    if(arr[j] + arr[k] == 2 * i)
                        cnt++;
                }
            answer = Math.max(answer, cnt);
        }
        System.out.println(answer);
    }
}