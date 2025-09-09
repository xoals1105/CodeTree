import java.util.Scanner;

public class Main {

    public static final int INT_MAX = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) 
        {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        int answer = INT_MAX;
        for(int i = 1; i < n - 1; i++)
        {
            int sum = 0;
            for(int j = 0; j < n - 1; j++)
            {
                if(i == j + 1)
                    sum += Math.abs(x[j] - x[j + 2]) + Math.abs(y[j] - y[j + 2]);
                else if (i != j)     
                    sum += Math.abs(x[j] - x[j + 1]) + Math.abs(y[j] - y[j + 1]);
            }
            answer = Math.min(answer, sum);
        }


        System.out.println(answer);
    }
}