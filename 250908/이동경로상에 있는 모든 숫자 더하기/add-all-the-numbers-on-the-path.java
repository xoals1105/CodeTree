import java.util.Scanner;

public class Main {

    public static int[] dx = new int[] {0, 1, 0, -1};
    public static int[] dy = new int[] {1, 0, -1, 0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        String commands = sc.next();
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                board[i][j] = sc.nextInt();
            }
        }


        int x = n / 2;
        int y = n / 2;
        int direction = 3;
        int sum = board[x][y];


            for(int i = 0; i < commands.length(); i++)
            {
    
                switch(commands.charAt(i))
                {
                    case 'L':
                        direction = (direction + 3) % 4;
                        break;
                    case 'R':
                        direction = (direction + 1) % 4;
                        break;
                    case 'F':
                        int newX = x + dx[direction];
                        int newY = y + dy[direction];

                        if (IsRange(newX, newY, n)) 
                        {
                       
                            x = newX;
                            y = newY;
                        
                            sum += board[x][y];
                        }
                        break;
                }
            }

        System.out.println(sum);
    }

    private static boolean IsRange(int x, int y, int n)
    {
        return x >= 0 && x < n && y >= 0 && y < n;
    }
}