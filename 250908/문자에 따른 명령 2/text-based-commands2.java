import java.util.Scanner;

public class Main {

    public static final int[] dx = new int[] {1, 0, -1, 0};
    public static final int[] dy = new int[] {0, -1, 0, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int x = 0;
        int y = 0;
        int initialDirection = 3;
        for(int i = 0; i < s.length(); i++)
        {
            switch(s.charAt(i))
            {
                case 'R':
                    if(initialDirection == 0)
                        initialDirection = 1;
                    else if(initialDirection == 1)
                        initialDirection = 2;
                    else if(initialDirection == 2)
                        initialDirection = 3;
                    else 
                        initialDirection = 0;         
                    break;
                case 'L':
                    if(initialDirection == 0)
                        initialDirection = 3;
                    else if(initialDirection == 1)
                        initialDirection = 0;
                    else if(initialDirection == 2)
                        initialDirection = 1;
                    else 
                        initialDirection = 2;
                    break;
                case 'F':
                    x += dx[initialDirection];
                    y += dy[initialDirection];
                    break;
            }
        }

        System.out.println(x + " " + y);
    }
}