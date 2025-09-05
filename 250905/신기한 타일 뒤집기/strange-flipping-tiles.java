import java.util.Scanner;

public class Main {

    public static final int max_n = 100000;

    public static int[] tile = new int[2 * max_n + 1];
    public static int black = 0; 
    public static int white = 0; 
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int location = max_n;

        for(int i = 0; i < n; i++)
        {
            int x = scanner.nextInt();
            char direction = scanner.next().charAt(0);

            if(direction == 'L')
            {
                while(x-- > 0)
                {
                    tile[location - 1] = 1;
                    location--;
                }
            }

            else if(direction == 'R')
            {
                while(x-- > 0)
                {
                    tile[location] = 2;
                    location++;
                }
            }
        }

        for(int i = 0; i < tile.length; i++)
        {
            if(tile[i] == 1) white++;
            if(tile[i] == 2) black++;
        }

        System.out.println(white + " " + black);
    }
}