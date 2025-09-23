import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        // 후보 1: 가장 큰 3개
        int case1 = arr[n-1] * arr[n-2] * arr[n-3];
        // 후보 2: 가장 작은 2개 * 가장 큰 1개
        int case2 = arr[0] * arr[1] * arr[n-1];

        System.out.println(Math.max(case1, case2));
    }
}
