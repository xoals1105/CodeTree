import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        
        int n, m;

        n = sc.nextInt();
        m = sc.nextInt();

        while (n <= m) {
            System.out.print(n + " ");
            n += 2;
        }

    }
}