import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();        
        int[] arr = new int[n];
        int cnt = 0;

        for(int i = 0; i < n; i++)
        {
            arr[i] = scanner.nextInt();
            if(arr[i] == m) cnt++;
        }

        System.out.print(cnt);
    }
}