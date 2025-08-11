import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = n; i > 0; i--)
        {
            for (int j = n; j > i; j--)
            {
                System.out.print("  ");
            }

            for (int j = 0; j < (i * 2) - 1; j++)
            {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}