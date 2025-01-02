import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n, m;

        m = sc.nextInt();
        n = sc.nextInt();

        while (m >= n) {
            System.out.print(m + " ");
            m -= 2;
        }
    }
}