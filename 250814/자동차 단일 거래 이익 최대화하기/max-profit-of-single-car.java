import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        final int INT_MAX = Integer.MAX_VALUE;
        final int INT_MIN = Integer.MIN_VALUE;

        Scanner scanner = new Scanner(System.in);

        int minVal = INT_MAX;
        int maxVal = INT_MIN;
        int cnt = 0;
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
        {
            arr[i] = scanner.nextInt();
            if(arr[i] < minVal)
            {
                minVal = arr[i];
                cnt = i;
            }
        }

        for(int i = cnt + 1; i < n; i++)
        {
            if(arr[i] > maxVal)
            {
                maxVal = arr[i];
            }
        }

        if(cnt == n - 1) System.out.print("0");
        else System.out.println(maxVal - minVal);
    }
}