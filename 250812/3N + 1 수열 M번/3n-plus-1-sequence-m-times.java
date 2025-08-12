import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        int scannerCnt = scanner.nextInt();

        for(int i = 0; i < scannerCnt; i++)
        {
            int n = scanner.nextInt();

            int numCnt = 0;
            while(n != 1)
            {
                if (n % 2 == 0)
                {
                    n /= 2;
                    numCnt++;
                }

                else if(n % 2 != 0)
                {
                    n = (n * 3) + 1;
                    numCnt++;
                }
            }
            System.out.println(numCnt);
        }
    }
}