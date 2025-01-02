import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 변수 선언
        char c;

        // 입력
        c = sc.next().charAt(0);

        // 출력
        for(int i = 1; i <= 8; i++)
            System.out.print(c);
    }