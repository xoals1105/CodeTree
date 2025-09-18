import java.util.Scanner;
public class Main {

    public static final int INT_MAX = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) 
        {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }

        int answer = INT_MAX;
        for(int i = 1; i <= 10000; i++)
        {
            int cnt = 0;
            int num = i;
            for(int j = 0; j < n; j++)
            {
                num *= 2;

                if(num >= a[j] && num <= b[j])
                    cnt++;
            }

            if(cnt == n)
            {
                answer = Math.min(i, answer);
            }
        }

        System.out.println(answer);
    }
}