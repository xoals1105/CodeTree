import java.util.Scanner;
public class Main 
{

    public static final int INT_MIN = Integer.MIN_VALUE;

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[101];
        for (int i = 0; i < n; i++) {
            int candies = sc.nextInt();
            int positions = sc.nextInt();

            arr[positions] += candies;
        }

        int answer = INT_MIN;
        for(int i = 0; i <= 100; i++)
        {   
            int sumCandies = 0;
                for(int j = i - k; j <= i + k; j++)
                    if(j >= 0 && j <= MAX_NUM)
                        sumCandies += arr[j];
            
            
            answer = Math.max(answer, sumCandies);
        }

        System.out.println(answer);
    }
}