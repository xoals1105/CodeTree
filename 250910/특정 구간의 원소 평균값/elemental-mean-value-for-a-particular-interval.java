import java.util.Scanner;
public class Main {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
    
        int answer = 0;
        for(int i = 0; i < n; i++)
        {   
            for(int j = i; j < n; j++)
            {
                int sum = 0;
                int cnt = 0;
                for(int k = i; k <= j; k++)
                {
                    sum += arr[k];
                    cnt++;
                }
                double average = (double) sum / cnt;

                // 구간 내에 원소 평균값과 동일한 원소가 있으면 개수를 세줍니다.
                boolean exists = false;
                for(int k = i; k <= j; k++)
                    if(arr[k] == average)
                        exists = true;
                
                if(exists)
                    answer++;
            }
        }

        System.out.println(answer);
    }
}