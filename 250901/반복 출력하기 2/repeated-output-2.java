import java.util.Scanner;
public class Main {

    public static void PrintString(int n)
    {
        if(n == 0) return;

        PrintString(n - 1);
        System.out.println("HelloWorld");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        PrintString(n);
    }
}