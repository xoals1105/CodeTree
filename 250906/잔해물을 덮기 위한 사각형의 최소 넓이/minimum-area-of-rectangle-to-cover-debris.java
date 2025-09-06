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
                    checked[x][y] = i + 1;
                }
            }
        }

        // 남아있는 A 영역의 bounding box 찾기
        int minX = MAX_RANGE, maxX = -1, minY = MAX_RANGE, maxY = -1;
        for (int x = 0; x < MAX_RANGE; x++) {
            for (int y = 0; y < MAX_RANGE; y++) {
                if (checked[x][y] == 1) {
                    minX = Math.min(minX, x);
                    maxX = Math.max(maxX, x);
                    minY = Math.min(minY, y);
                    maxY = Math.max(maxY, y);
                }
            }
        }

        // 잔해물이 없는 경우
        if (maxX == -1) return 0;

        return (maxX - minX + 1) * (maxY - minY + 1);
    }
}