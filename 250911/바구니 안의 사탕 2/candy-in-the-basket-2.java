import java.util.Scanner;
public class Main 
{

    public static final int INT_MIN = Integer.MIN_VALUE;

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[100];
        for (int i = 0; i < n; i++) {
            int candies = sc.nextInt();
            int positions = sc.nextInt();

            arr[positions] += candies;
        }

        int answer = INT_MIN;
        for(int i = 0; i <= 99; i++)
        {   
            int sumCandies = 0;
            if(0 <= (i - k) && 99 >= (i + k))
                for(int j = i - k; j <= i + k; j++)
                    sumCandies += arr[j];
            
            
            answer = Math.max(answer, sumCandies);
        }

        System.out.println(answer);
    }
}