import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int Repetition = 0;

        while(Repetition < 2)
        {
            for (int i = 0; i < n; i++)
            {
                for (int j = 0; j < n; j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println();
            Repetition++;
        }
    }
}