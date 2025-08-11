import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = n; i <= n; i++)
        {
            for (int j = n; j <= n; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}