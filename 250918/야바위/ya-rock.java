import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
        }

        int answer = 0;
        for(int i = 1; i <= n; i++)
        {
            int[] arr = new int[n + 1];
            arr[i] = i;
            int cnt = 0;
            for(int j = 0; j < n; j++)
                cnt += ConfidenceGame(arr, a, b, c, i, j);
            
            answer = Math.max(answer, cnt);
        }

        System.out.println(answer);
    }

    private static int ConfidenceGame(int[] arr, int[] a, int[] b, int[] c, int i, int j)
    {
        int cnt = 0;
        int temp = arr[a[j]];
        arr[a[j]] = arr[b[j]];
        arr[b[j]] = temp;

        if(arr[c[j]] == i)
            cnt++;

        return cnt;

    }
}