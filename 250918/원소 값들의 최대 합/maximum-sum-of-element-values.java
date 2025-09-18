import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }

        int answer = 0;
        for(int i = 1; i <= n; i++)
        {
            int location = i;
            int sum = 0;
            int cnt = 0;
            while(cnt != m)
            {
                location = arr[location];
                cnt++;
                sum += location;
            }

            answer = Math.max(answer, sum);
        }

        System.out.println(answer);
    }
}