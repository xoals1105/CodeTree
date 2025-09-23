import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }


        int answer = 101;
        for(int i = 0; i < N; i++)
        {
            answer = Math.min(answer, arr[i]);
        }

        int cnt = 0;
        int answer2 = 101;
        for(int i = 0; i < N; i++)
        {
            if(answer < arr[i])
            {
                answer2 = Math.min(answer2, arr[i]);
            }
        }

        int location = 0;
        for(int i = 0; i < N; i++)
        {
            if(arr[i] == answer2)
            {
                location = i + 1;
                cnt++;
            }
        }

        if(cnt != 1)
            System.out.println("-1");
        else 
            System.out.println(location);
    }
}