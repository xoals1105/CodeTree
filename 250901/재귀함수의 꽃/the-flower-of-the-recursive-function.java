import java.util.Scanner;
public class Main {

    public static void PrintNumber(int n)
    {
        if(n == 0) return;

        System.out.print(n + " ");
        PrintNumber(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    
        PrintNumber(n);
    }
}