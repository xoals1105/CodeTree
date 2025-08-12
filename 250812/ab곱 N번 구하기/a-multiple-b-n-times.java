import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        int cnt = scanner.nextInt();

        for(int i = 0; i < cnt; i ++)
        {
            int first = scanner.nextInt();
            int second = scanner.nextInt();

            int sum = 1;
            for(int j = first; j <= second; j++)
            {
                sum *= j;
            }

            System.out.println(sum);
        }
    }
}