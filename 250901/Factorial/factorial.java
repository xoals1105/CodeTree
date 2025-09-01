import java.util.Scanner;

public class Main {

    public static int Calculation(int n)
    {
        if(n == 0) return 1;
        return n * Calculation(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    
        System.out.println(Calculation(n));
    }
}