import java.util.Scanner;

public class Main {

    public static final int[] dx = new int[] {0, 1, 0, -1};
    public static final int[] dy = new int[] {1, 0, -1, 0};

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int x = (n / 2);
        int y = (n / 2);
        int direction = 0;
        int moveLen = 1;
        int moveCnt = 0;
        int directionChangeCnt = 0;
        int[][] arr = new int[n][n];
        arr[x][y] = 1;
        for(int i = 2; i <= n * n; i++)
        {
            int newX = x + dx[direction];
            int newY = y + dy[direction];

            if(!IsRange(newX, newY, n) || arr[newX][newY] != 0 || moveCnt == moveLen)
            {
                direction = (direction + 3) % 4;
                moveCnt = 0;
                directionChangeCnt++;
                if(directionChangeCnt == 2)
                {
                    directionChangeCnt = 0;
                    moveLen++;
                }
            }

            
            x += dx[direction];
            y += dy[direction];

            arr[x][y] = i;
            moveCnt++;
        }

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }

    private static boolean IsRange(int x, int y, int n)
    {
        return x >= 0 && x < n && y >= 0 && y < n;
    }
}