import java.util.Scanner;
public class Main 
{
    public static final int MAx = 10000;

    public static int[] dx = new int[] {1, -1, 0, 0};
    public static int[] dy = new int[] {0, 0, -1, 1};


    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        int y = 0;
        for (int i = 0; i < n; i++) 
        {
            char direction = sc.next().charAt(0);
            int distance = sc.nextInt();

            while(distance-- > 0)
            {
                switch(direction)
                {
                    case 'E':
                        x += dx[0];
                        break;
                    case 'W':
                        x += dx[1];
                        break;
                    case 'S':
                        y += dy[2];
                        break;
                    case 'N':
                        y += dy[3]; 
                        break;
                }         
            }
        }

        System.out.println(x + " " + y);
    }
}