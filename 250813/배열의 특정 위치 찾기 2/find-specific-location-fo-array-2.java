import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[10];
        int odd_sum = 0;
        int even_sum = 0;
        for(int i = 0; i < 10; i++)
        {
            arr[i] = scanner.nextInt();
        }

        for(int i = 0; i < 10; i++)
        {
            if((i + 1) % 2 == 0) odd_sum += arr[i];
            else even_sum += arr[i];
        }

        if (odd_sum >= even_sum) System.out.print(odd_sum - even_sum);
        else System.out.print(even_sum - odd_sum);
    }
}