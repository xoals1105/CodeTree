import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt(); // N1
        int b = scanner.nextInt(); // N2

        int[] a_arr = new int[a];
        int[] b_arr = new int[b];

        for (int i = 0; i < a; i++) {
            a_arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < b; i++) {
            b_arr[i] = scanner.nextInt();
        }

        boolean found = false;

        // A에서 시작 위치를 하나씩 잡고 확인
        for (int start = 0; start <= a - b; start++) {
            int cnt = 0; // 여기서 cnt는 "연속으로 맞은 개수"
            for (int j = 0; j < b; j++) {
                if (a_arr[start + j] == b_arr[j]) {
                    cnt++;
                } else {
                    break; // 하나라도 틀리면 그 시작 위치는 실패
                }
            }
            if (cnt == b) {
                found = true;
                break;
            }
        }

        System.out.println(found ? "Yes" : "No");
    }
}
