import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Sacnner(System.in);

        int n = scanner.nextInt();
        int cnt = 9;

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (cnt == 0)
                    cnt = 9;
                System.out.print(cnt);
                cnt--;
            }
            System.out.println();
        }
    }
}