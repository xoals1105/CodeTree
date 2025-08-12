import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= n; j++)
                if (j == 1 && i == 1)
                    System.out.print(10 + (i * j) + " ");
                else 
                    System.out.print(10 + (i * j + 2) + " ");

            System.out.println();
        }
    }
}