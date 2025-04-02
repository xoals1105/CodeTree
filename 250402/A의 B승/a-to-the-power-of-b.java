import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a, b, prod = 1;

        a = sc.nextInt();
        b = sc.nextInt();

        for(int i = 1; i <= b; i++) {
            prod *= a;
        }

        System.out.print(prod);
    }
}