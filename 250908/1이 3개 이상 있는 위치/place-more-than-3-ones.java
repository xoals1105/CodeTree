import java.util.Scanner;
public class Main {

    public static final int[] dx = new int[] {0, 1, 0, -1};
    public static final int[] dy = new int[] {1, 0, -1, 0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        
        for (int i = 0; i < n; i++) 
            for (int j = 0; j < n; j++) 
                arr[i][j] = sc.nextInt();
    
        int find = 0;
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                int cnt = 0;
                for(int z = 0; z < 4; z++)
                {
                    int newX = i + dx[z];
                    int newY = j + dy[z];
                    if(IsRange(newX, newY, n) && arr[newX][newY] == 1)
                        cnt++;
                }

                if(cnt >= 3)
                    find++;
            }
        }

        System.out.println(find);
    }

    private static boolean IsRange(int x, int y, int n)
    {
        return (x >= 0 && x < n && y >= 0 && y < n);
    }
}