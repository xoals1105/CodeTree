import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String seats = sc.next();
        int[] arr = new int[N + 1];
        for(int i = 1; i <= N; i++)
            arr[i] = seats.charAt(i - 1 ) - '0';

        int answer = 0;
        for(int i = 1; i <= N; i++)
        {   
            if(arr[i] != 1)
                continue;
    
            int distance = 0;
            for(int j = i + 1; j <= N; j++)
            {
                if(arr[j] == 1)
                {
                    distance = Math.abs(j - i);
                    break;
                }
            }

            answer = Math.max(distance, answer);
        }

        System.out.println(answer / 2);
    }
}