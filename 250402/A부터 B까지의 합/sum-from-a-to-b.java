import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a, b, sumval = 0;

        a = sc.nextInt();
        b = sc.nextInt();

        for(int i = a; i <= b; i++) {
            sumval += i;
        }

        System.out.println(sumval);
    }
}