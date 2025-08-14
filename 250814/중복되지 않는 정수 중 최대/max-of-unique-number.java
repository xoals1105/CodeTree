import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];
        int cnt = 0;

        for(int i = 0; i < n; i++)
        {
            arr[i] = scanner.nextInt();
        }

        int maxVal = arr[0];

        for(int i = 0; i < n; i++)
        {
            if(arr[i] > maxVal)
            {
                maxVal = arr[i];
            }
        }

        for(int i = 0; i < n; i++)
        {
            if(arr[i] == maxVal)
            {
                cnt++;
            }
        }

        System.out.print(cnt >= 2 ? "-1" : maxVal);
    }
}