import java.util.Scanner;
public class Main {

    public static final int INT_MAX = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
    
        int answer = INT_MAX;
        for(int i = 0; i < n; i++)
            for(int j = i + 1; j < n; j++)
            {
                int distanceBetweenTwoPoints= (x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]);
                answer = Math.min(answer, distanceBetweenTwoPoints);
            }
        System.out.println(answer);
    }
}