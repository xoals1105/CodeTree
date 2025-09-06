import java.util.Scanner;

public class Main {

    public static final int MAX_RANGE = 2000;
    public static final int offSet = 1000;

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int[] rect_x1 = new int[2];
        int[] rect_y1 = new int[2];
        int[] rect_x2 = new int[2];
        int[] rect_y2 = new int[2];

        for(int i = 0; i < 2; i++)
        {
            rect_x1[i] = offSet + sc.nextInt();
            rect_y1[i] = offSet + sc.nextInt();
            rect_x2[i] = offSet + sc.nextInt();
            rect_y2[i] = offSet + sc.nextInt();
        }

        int range = MakeRectangle(rect_x1, rect_y1, rect_x2, rect_y2);
        System.out.println(range);
    }

    private static int MakeRectangle(int[] x1, int[] y1, int[] x2, int[] y2)
    {
        int[][] checked = new int[MAX_RANGE][MAX_RANGE];

        for(int i = 0; i < 2; i++)
        {
            for(int x = x1[i]; x < x2[i]; x++)
            {
                for(int y = y1[i]; y < y2[i]; y++)
                {
                    if(checked[x][y] != 1) checked[x][y] = i + 1;
                    else checked[x][y] = 1;
                }
            }
        }

        int cnt = 0;
        for(int i = 0; i < MAX_RANGE; i++)
            for(int j = 0; j < MAX_RANGE; j++)
                if(checked[i][j] == 1) cnt++;

        return cnt;
    }
}