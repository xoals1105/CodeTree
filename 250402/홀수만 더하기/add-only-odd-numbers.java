import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n, m, sum = 0;

        n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            m = sc.nextInt();

            if(m % 2 == 1 && m % 3 == 0)
                sum += m;
        }

        System.out.println(sum);
    }
}