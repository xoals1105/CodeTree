import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();

        int[] p = new int[n];
        int[] s = new int[n];

        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
            s[i] = sc.nextInt();
        }

        int answer = 0;

        // i번째 학생에게 쿠폰을 적용한다고 가정
        for (int i = 0; i < n; i++) {
            int[] cost = new int[n];
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    cost[j] = (p[j] / 2) + s[j]; // 쿠폰 적용
                } else {
                    cost[j] = p[j] + s[j];
                }
            }

            Arrays.sort(cost);

            int sum = 0, cnt = 0;
            for (int c : cost) {
                if (sum + c > b) break;
                sum += c;
                cnt++;
            }

            answer = Math.max(answer, cnt);
        }

        System.out.println(answer);
    }
}
