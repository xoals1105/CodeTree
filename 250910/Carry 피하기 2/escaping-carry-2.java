import java.util.Scanner;
public class Main {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    

        int answer = -1;
        for(int i = 0; i < n; i++)
        {
            for(int j = i + 1; j < n; j++)
            {
                for(int k = j + 1; k < n; k++)
                {
                    int sum = 0;
                    if(NoCarry(arr[i], arr[j], arr[k]))
                    {
                        sum = arr[i] + arr[j] + arr[k];
                        answer = Math.max(answer, sum);
                    }
                }
            }
        }

        System.out.println(answer);
    }

    private static boolean NoCarry(int a, int b, int c)
    {
        while(a > 0 || b > 0 || c > 0)
        {
            int digitSum = (a % 10) + (b % 10) + (c % 10);
            if(digitSum >= 10) return false;
            a /= 10;
            b /= 10;
            c /= 10;
        }
        return true;
    }
}