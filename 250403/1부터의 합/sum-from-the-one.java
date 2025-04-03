import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 변수 선언
        int n;
        int sum = 0;

        n = sc.nextInt();
        
        // 1부터 증가시키며 더한 값이 n이상이 된 순간, 더해진 숫자를 출력합니다.
        for(int i = 1; i <= 100; i++) {
            sum += i;
            if(sum >= n) {
                System.out.print(i);
                break;
            }
        }
    }
}
