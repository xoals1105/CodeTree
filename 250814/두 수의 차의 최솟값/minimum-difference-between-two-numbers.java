import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        int num = 0;
        int num1 = 100;
        for(int i = 0; i < n; i++)
            arr[i] = scanner.nextInt();

        for(int i = 0; i < n - 1; i++)
        {
            for(int j = i+1; j < n; j++)
            {
                if(arr[i] > arr[j])
                {
                 num = arr[i] - arr[j];
                }
                else num = arr[j] - arr[i];

                if(num1 > num) num1 = num;
            }
        }

        System.out.println(num1);
    }
}