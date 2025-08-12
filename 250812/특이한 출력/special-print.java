import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= n; j++)
            {
                 System.out.print("(" + i + ", " + j + ") ");

                if ((i + j) % 4 == 0)
                    System.out.println();               
            }
        }
    }
}