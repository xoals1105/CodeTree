import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        int n;

        // 입력
        n = sc.nextInt();
        
        // 출력
        for(int i = n; i <= 5 * n; i += n)
            System.out.print(i + " ");
    }
}