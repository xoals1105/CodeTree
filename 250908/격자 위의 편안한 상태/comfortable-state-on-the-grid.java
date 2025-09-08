import java.util.Scanner;
public class Main {

    public static int[] dx = new int[] {0, 1, 0, -1};
    public static int[] dy = new int[] {1, 0, -1, 0};

    public static int n = 0;
    public static int m = 0;

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        int[][] arr = new int[n][n];
        while(m-- > 0)
        {
            int colorX = sc.nextInt() - 1;
            int colorY = sc.nextInt() - 1;
            int cnt = 0;
            int direction = 0;
           
            arr[colorX][colorY] = 1;

            if(IsComfortableCondition(arr, colorX, colorY) == 3)
                System.out.println("1");
            else 
                System.out.println("0");
        }

    }

    private static int IsComfortableCondition(int[][] arr, int colorX, int colorY)
    {
        int cnt = 0;
        for(int i = 0; i < 4; i++)
        {
            int newX = colorX + dx[i];
            int newY = colorY + dy[i];

            if(IsRange(newX, newY) && arr[newX][newY] == 1)
            {
                cnt++;
            }
        }

        return cnt;
    }

    private static boolean IsRange(int x, int y)
    {
        return x >= 0 && x < n && y >= 0 && y < n;
    }
}