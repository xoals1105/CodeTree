import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= a; i++)
        {
            for (int j = 1; j <= b; j++)
                System.out.print(i * j + " ");
            System.out.println();
        }
    }
}