import java.util.Scanner;
public class Main {

    public static final int maxRange = 200;
   
    public static final int offSet = 100; 

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x1 = new int[n];
        int[] y1 = new int[n];
        int[] x2 = new int[n];
        int[] y2 = new int[n];

        
        for (int i = 0; i < n; i++) 
        {
            x1[i] = sc.nextInt();
            y1[i] = sc.nextInt();
            x2[i] = sc.nextInt();
            y2[i] = sc.nextInt();

            x1[i] += offSet;
            y1[i] += offSet;
            x2[i] += offSet;
            y2[i] += offSet;
        
        }

        int area = calculateRange(n, x1, y1, x2, y2);
        System.out.println(area);
    }

    private static int calculateRange(int n, int[] x1, int[] y1, int[] x2, int[] y2)
    {
        int[][] checked = new int[maxRange + 1][maxRange + 1];

        for(int i = 0; i < n; i++)
        {
            for(int j = x1[i]; j < x2[i]; j++)
            {
                for(int z = y1[i]; z < y2[i]; z++)
                {
                    if(i % 2 == 0)    checked[j][z] = 1;
                    else checked[j][z] = 2;
                }
            }
        }

        int cnt = 0;
        for(int i = 0; i < maxRange; i++)
            for(int j = 0; j < maxRange; j++)
                if(checked[i][j] == 2) cnt++;            

        return cnt;
    }
}