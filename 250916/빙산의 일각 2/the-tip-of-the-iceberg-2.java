import java.util.Scanner;
public class Main {

    public static final int INT_MIN = Integer.MIN_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }

        int answer = INT_MIN;
        for(int i = 1; i <= 1000; i++)
        {
            int[] iceberg = new int[n];
            for(int j = 0; j < n; j++)
            {
                if(h[j] > i)
                    iceberg[j] = 1;
                else
                    iceberg[j] = 0;
            }

            int cnt = 0;
            if(h[0] > i)
                    cnt++;
            boolean find = false;
            for(int j = 1; j < n; j++)
            {
                if(h[j] > i && h[j - 1] <= i)
                    cnt++;
            }

            answer = Math.max(answer, cnt);
        }

        System.out.println(answer);
    }
}