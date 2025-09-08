import java.util.Scanner;
public class Main {

    public static int[] dx = new int[] {1, 0, -1, 0};    
    public static int[] dy = new int[] {0, -1, 0, 1}; 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        int x = 0;
        int y = 0;
        boolean find = true;
        for(int i = 0; i < n && find; i++){
            char dir = sc.next().charAt(0);
            int dist = sc.nextInt();

            while(dist-- > 0)
            {
                switch(dir)
                {
                    case 'E':
                        x += dx[0];
                        y += dy[0];
                        break;
                    case 'W':
                        x += dx[2];
                        y += dy[2];
                        break;
                    case 'S':
                        x += dx[1];
                        y += dy[1];
                        break;
                    case 'N':
                        x += dx[3];
                        y += dy[3];
                        break;
                }

                cnt++;
                if(x == 0 && y == 0) 
                {
                    find = false;
                    break;
                }
                
            }       
        }

        System.out.println(find ? "-1" : cnt);
    }
}