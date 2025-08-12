import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++)
        {
            if (i % 2 != 0)
            {
                for (int j = 0; j < n; j++)
                {
                    System.out.print(j + 1 + " ");
                }
            }

            else 
            {
                for (int j = n; j > 0; j--)
                {
                    System.out.print(i * j + " ");
                }
            }

            System.out.println();
        }
    }
}