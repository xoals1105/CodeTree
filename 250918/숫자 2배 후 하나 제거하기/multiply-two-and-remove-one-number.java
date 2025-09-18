import java.util.Scanner;

public class Main {

    public static final int INT_MAX = Integer.MAX_VALUE;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int answer = INT_MAX;
        for(int i = 0; i < n; i++)
        {
            arr[i] *= 2;

            for(int j = 0; j < n; j++)
            {
                int[] newArr = new int[n];
                int cnt = 0;
                for(int k = 0; k < n; k++)
                {
                    if(j != k)
                    {
                        newArr[cnt++] = arr[k];
                        // System.out.println(j + " " + k);
                    }
                }

                int sum = 0;
                for(int k = 0; k < n - 2; k++)
                    sum += Math.abs(newArr[k + 1] - newArr[k]);
                    
            
                answer = Math.min(answer, sum);
            }

            arr[i] /= 2;
        }

        System.out.println(answer);
    }
}