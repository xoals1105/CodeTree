import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a < 0 ) {
            System.out.println(a);
            System.out.println("minus");
        }

        else System.out.println(a);
    }
}