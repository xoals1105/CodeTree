import java.util.Scanner;
public class Main {

    public static int[] dx = new int[] {1, 0, -1, 0};
    public static int[] dy = new int[] {0, -1, 0, 1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String commands = sc.next();

        int direction = 3;
        int x = 0;
        int y = 0;
        int cnt = 0;
        boolean find = false;
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
                    x += dx[direction];
                    y += dy[direction];
                    break;
            }
            cnt++;

            if(x == 0 && y == 0)
            {   
                find = true;
                break;
            }
        }

        System.out.println(find ? cnt : "-1");
    }
}