import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 변수 선언 및 입력
        int a, b;
        int sum = 0, cnt = 0;
        double avg;

        a = sc.nextInt();
        b = sc.nextInt();

        // a부터 b까지의 수 중 5 또는 7의 배수인 수들을 더합니다.
        for(int i = a; i <= b; i++) {
            if(i % 5 == 0 || i % 7 == 0) {
                sum += i;
                cnt++;
            }
        }

        // a부터 b까지의 수 중 5 또는 7의 배수인 수들의 평균을 구합니다.
        avg = (double)sum / cnt;

        // 출력
        System.out.printf("%d %.1f", sum, avg);
    }
}
