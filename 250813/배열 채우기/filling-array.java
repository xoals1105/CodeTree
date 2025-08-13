import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[10];
        int cnt = 0;

        for(int i = 0; i < 10; i++)
        {
            arr[i] = scanner.nextInt();

            if (arr[i] == 0)
            {
                cnt = i - 1;
                break;
            }

            cnt = i;
        }

        for(int i = cnt; i >=0; i--)
            System.out.print(arr[i] + " ");

    }
}