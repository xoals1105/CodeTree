import java.util.Scanner;
public class Main {

    public static int offSet = 100;
    public static int MAX_R = 100;
    public static int[][] checked = new int[2 * MAX_R + 1][2 * MAX_R + 1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x1 = new int[n];
        int[] y1 = new int[n];
        int[] x2 = new int[n];
        int[] y2 = new int[n];
        for (int i = 0; i < n; i++) {
            x1[i] = sc.nextInt();
            y1[i] = sc.nextInt();
            x2[i] = sc.nextInt();
            y2[i] = sc.nextInt(); 

            x1[i] += offSet;
            y1[i] += offSet;
            x2[i] += offSet;
            y2[i] += offSet;
        }

        int cnt = 0;
        int rectangle = 1;
        for(int z = 0; z < n; z++)
        {
            for(int i = x1[z]; i < x2[z]; i++)
            {
                for(int j = y1[z]; j < y2[z]; j++)
                    checked[i][j] = 1;
            }
        }

        for(int x = 0; x < 200; x++)
            for(int y = 0; y < 200; y++)
                if(checked[x][y] == 1)
                    cnt++;

        System.out.println(cnt);

    }
}