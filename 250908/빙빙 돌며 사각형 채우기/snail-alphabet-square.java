import java.util.Scanner;
public class Main {

    public static int[] dx = new int[] {0, 1, 0, -1};
    public static int[] dy = new int[] {1, 0, -1, 0};

    public static int n = 0;
    public static int m = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int x = 0;
        int y = 0;
        int direction = 0;
        char[][] arr = new char[n][m];
        arr[0][0] = 'A';
        for(int i = 1; i < n * m; i++)
        {
            int newX = x + dx[direction];
            int newY = y + dy[direction];
            if(!IsRange(newX, newY) || arr[newX][newY] != 0)
                direction = (direction + 1) % 4;

            x += dx[direction];
            y += dy[direction];

            
            arr[x][y] = (char)('A' + (i % 26));
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
        return (x >= 0 && x < n && y >= 0 && y < m);
    }
}