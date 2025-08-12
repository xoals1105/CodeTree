import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int oddCnt = n;
        int evenCnt = 1;
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (j % 2 == 0)
                    System.out.print(evenCnt);
                
                else
                    System.out.print(oddCnt);
            }
            evenCnt++;
            oddCnt--;
            System.out.println();
        }
    }
}