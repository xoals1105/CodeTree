import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n, sum = 0;

        n = sc.nextInt();

        for(int i = n; i <= 100; i++)
            sum += i;
        
        System.out.println(sum);
    }
}