import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];
        int cnt = 0;
        int num = 0;
        for(int i = 0; i < n; i++)
        {
            arr[i] = scanner.nextInt();
            if(arr[i] == 2 && cnt != 3)
            {
                num = i;
                cnt++;
            }
        }

        System.out.print(num + 1);

    }
}