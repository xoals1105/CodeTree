import java.util.Scanner;
public class Main {

    public static final int maxRange = 200;
    public static final int paperLength = 8;
    public static final int offSet = 100; 

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        
        for (int i = 0; i < n; i++) 
        {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();

            x[i] += offSet;
            y[i] += offSet;
        }

        int area = calculateRange(n, x, y);
        System.out.println(area);
    }

    private static int calculateRange(int n, int[] x, int[] y)
    {
        int[][] checked = new int[maxRange + 1][maxRange + 1];

        for(int i = 0; i < n; i++)
            for(int j = x[i]; j < x[i] + paperLength; j++)
                for(int z = y[i]; z < y[i] + paperLength; z++)
                    checked[j][z] = 1;

        int cnt = 0;
        for(int i = 0; i < maxRange; i++)
            for(int j = 0; j < maxRange; j++)
                if(checked[i][j] == 1) cnt++;            

        return cnt;
    }
}