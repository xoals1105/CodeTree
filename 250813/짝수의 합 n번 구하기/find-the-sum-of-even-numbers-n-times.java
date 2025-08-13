import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for(int i = 0; i < n; i++)
        {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            int sum = 0;
            for(int current_num = a; current_num <= b; current_num++)
            {
                if(current_num % 2 == 0)
                    sum += current_num;
            }

            System.out.println(sum);       
        }
    }
}