import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a, b;

        a = sc.nextInt();

        for(int i = 1; i <= a; i++) {
            if(i % 2 == 0 && i % 4 != 0)
                continue;
            b = i / 8;

            if(b % 2 == 0)
                continue;
            if(i % 7 < 4)
                continue;

            System.out.print(i + " ");
        }
    }
}