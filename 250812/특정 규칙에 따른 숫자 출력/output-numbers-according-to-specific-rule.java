import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int cnt = 1;
        for (int i = n; i > 0; i--)
        {
            for (int j = 0; j < n - i; j++)
                 System.out.print("  ");
                
            if (cnt == 10)
                cnt = 1;
                    
            for (int j = i; j > 0; j--)
            {
                System.out.print(cnt + " ");
                cnt++;
            }
            System.out.println();
        }
    }
}