import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 변수 선언
        int n;

        // 입력
        n = sc.nextInt();

        // 출력
        for(int i = 1; i <= n; i++) {
            if(i % 2 == 0 || i % 3 == 0)
                System.out.print("1 ");
            else
                System.out.print("0 ");
        }
    }
}