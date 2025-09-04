import java.util.Scanner;
public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] block = new int[N];
        for (int i = 0; i < K; i++) 
        {
            int A = sc.nextInt();
            int B = sc.nextInt();

            for(int j = A; j <= B; j++)
                block[j - 1] += 1;
        }

        int max = 0;
        for(int i = 0; i < N; i++)
            if(block[i] > max) max = block[i];

        System.out.println(max);
    }
}