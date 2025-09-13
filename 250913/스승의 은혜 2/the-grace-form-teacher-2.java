import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // 학생 수
        int b = sc.nextInt();  // 예산
        int[] p = new int[n];

        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }

        int answer = 0;

        // i번째 학생을 할인 대상으로 설정
        for (int i = 0; i < n; i++) {
            int[] temp = p.clone();       // 배열 복사
            temp[i] /= 2;                 // i번째 학생 가격 절반 할인
            Arrays.sort(temp);            // 오름차순 정렬

            int sum = 0, cnt = 0;
            for (int j = 0; j < n; j++) {
                if (sum + temp[j] > b) break;
                sum += temp[j];
                cnt++;
            }

            answer = Math.max(answer, cnt);
        }

        System.out.println(answer);
    }
}
