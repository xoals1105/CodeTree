import java.util.Scanner;
public class Main {
    public static final int INT_MAX = Integer.MAX_VALUE;
    public static final int INT_MIN = Integer.MIN_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] x = new int[N];
        int[] y = new int[N];
        for (int i = 0; i < N; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        int answer = INT_MAX;
        for(int i = 0; i < N; i++)
        {
            int maxX = INT_MIN;
            int minX = INT_MAX;
            int maxY = INT_MIN;
            int minY = INT_MAX;
            for(int j = 0; j < N; j++)
            {
                if(i == j)
                    continue;
                
                maxX = Math.max(maxX, x[j]);
                minX = Math.min(minX, x[j]);
                maxY = Math.max(maxY, y[j]); 
                minY = Math.min(minY, y[j]); 
            }

            int area = (maxX - minX) * (maxY - minY) * 2;
            answer = Math.min(area, answer);
        }

        System.out.println(answer);
    }
}