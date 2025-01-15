import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a, b;

        a = sc.nextInt();
        b = sc.nextInt();

        if(a > b) {
            for(int i = a; i >= b; i--)
                System.out.print(i + " ");
        }

        else {
            for(int i = b; i >= a; i--)
                System.out.print(i + " ");
        }
    }
}