import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        final int INT_MAX = Integer.MAX_VALUE;

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];
        int cnt = 0;
        int minVal = INT_MAX;

        for(int i = 0; i < n; i++)
        {
            arr[i] = scanner.nextInt();
            if(arr[i] < minVal)
            {
                minVal = arr[i];
                if(minVal == arr[i])
                    cnt++;
            }
        }
        System.out.print(minVal + " " + cnt);   
    }
}