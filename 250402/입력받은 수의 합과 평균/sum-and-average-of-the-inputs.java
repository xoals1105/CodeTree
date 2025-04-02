import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n, m, sum = 0, cent = 0;
        double avg = 0;

        n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            m = sc.nextInt();
            sum += m;
        }

        avg = (double)sum / n;

        System.out.print(sum + " " + avg);

    }
}