import java.util.Scanner;

class AA
{
    int R;
    int C;

    public AA(int R, int C)
    {
        this.R = R;
        this.C = C;
    }
}

public class Main {

    public static final int[] dx = new int[] {0, 1, -1, 0}; 
    public static final int[] dy = new int[] {1, 0, 0, -1};
    
    public static int N = 0; 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt(); // 격자
        
       
        int T = sc.nextInt(); // 초
        int RR = sc.nextInt() - 1; //행
        int CC = sc.nextInt() - 1; //열

        AA aa = new AA(RR, CC);
        char D = sc.next().charAt(0);

       
        int s = GetDirection(D);
        MoveSecond(T, aa, s);
          

        System.out.println((aa.R + 1) + " " + (aa.C + 1));
    }

    private static void MoveSecond(int T, AA aa, int s)
    {
        int[][] arr = new int[N][N];

        for(int i = 0; i < T; i++)
        {
            int newX = aa.R + dx[s];
            int newY = aa.C + dy[s];
            if(!IsRange(newX, newY))
            {
                s = 3 - s;
                continue;
            }

            aa.R += dx[s];
            aa.C += dy[s];

            // System.out.println((aa.R) + " " + (aa.C));
        }
       

    }

    private static int GetDirection(char D)
    {
         switch(D)
        {
            case 'U':
                return 2;
            case 'D':
                return 1;
            case 'R':
                return 0;
            case 'L':
                return 3;
        }
        return -1;
    }

    private static boolean IsRange(int x, int y)
    {
        return (x >= 0 && x < N && y >= 0 && y < N);
    }

    
}