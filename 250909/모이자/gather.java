import java.util.Scanner;
public class Main {

    public static final int INT_MAX = Integer.MAX_VALUE;
    public static final int MAX = 100;
    public static int[] house = new int[MAX];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) 
            house[i] = sc.nextInt();

        int answer = INT_MAX;
        for(int i = 0; i < n; i++)
        {
            int sum = 0;
            for(int j = 0; j < n; j++)
            {
                sum += Math.abs(j - i) * house[j];
            }
            answer = Math.min(answer, sum);
        }

        System.out.println(answer);
    }
}