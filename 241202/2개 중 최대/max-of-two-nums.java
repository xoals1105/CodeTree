import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a, b, c; 

        a = sc.nextInt();
        b = sc.nextInt();

        c = a > b ? a : b;

        System.out.println(c);
    }
}