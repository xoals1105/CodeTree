import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
    
        int cnt = 0, length = 1;
        for(int i = 0; i < n; i++)
        {
            if(arr[0] > t) cnt++;

            if(arr[i] > t && arr[i - 1] > t) cnt++;
            else cnt = 1;

            length = Math.max(length, cnt);
        }

        System.out.println(length);
    }
}