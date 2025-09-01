import java.util.Scanner;

public class Main {

    public static int Fibonacci(int n)
    {
        if(n <= 2) return 1;
        return Fibonacci(n - 2) + Fibonacci(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    
        System.out.println(Fibonacci(n));
    }
}