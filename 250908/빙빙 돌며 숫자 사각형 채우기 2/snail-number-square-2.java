import java.util.Scanner;
public class Main {

    public static int[] dx = new int[] {0, 1, 0, -1};
    public static int[] dy = new int[] {1, 0 ,-1, 0};


    public static int n = 0;
    public static int m = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        int x = 0;
        int y = 0;
        int newX = 0;
        int newY = 0;
        int direction = 1; 
        int[][] arr = new int[n][m];
        arr[x][y] = 1;
        for(int i = 2; i <= n * m; i++)
        {
            newX = x + dx[direction];
            newY = y + dy[direction];
            if(!IsRange(newX, newY) || arr[newX][newY] != 0)
                direction = (direction + 3) % 4;
            
            x += dx[direction];
            y += dy[direction];
            arr[x][y] = i;     
        }

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }

    private static boolean IsRange(int x, int y)
    {
        return x >= 0 && x < n && y >= 0 && y < m;
    }
}