import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n;
        int i = 0; 

        n = sc.nextInt();

        while (i < n) {
            System.out.println("*");
            i++;
        }
    }
}