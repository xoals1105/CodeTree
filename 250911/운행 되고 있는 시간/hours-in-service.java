import java.util.Scanner;
public class Main {

    public static final int INT_MIN = Integer.MIN_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
        }

        int answer = INT_MIN;
        for(int i = 0; i < N; i++)
        {
            int[] workTime = new int[1001];
            for(int j = 0; j < N; j++)
            {
                if(i == j)
                    continue;
                for(int k = A[j]; k < B[j]; k++)
                    workTime[k] = 1;

                int cnt = 0;
                for(int k = 0; k < workTime.length; k++)
                    if(workTime[k] == 1)
                        cnt++;
                
                answer = Math.max(answer, cnt);
            }
        }
        System.out.println(answer);
    }
}