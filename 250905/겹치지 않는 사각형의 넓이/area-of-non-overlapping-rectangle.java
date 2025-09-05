import java.util.Scanner;
public class Main {

    public static int max = 1000;
    public static int[][] rectangle = new int[2 * max + 1][2 * max + 1];
    public static int num = 1;

    public static void Coloring(int x1, int y1, int x2, int y2)
    {   
        for(int i = x1; i < x2; i++)
            for(int j = y1; j < y2; j++)
                rectangle[i][j] = num;
        num++;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ax1 = sc.nextInt();
        int ay1 = sc.nextInt();
        int ax2 = sc.nextInt();
        int ay2 = sc.nextInt();
        int bx1 = sc.nextInt();
        int by1 = sc.nextInt();
        int bx2 = sc.nextInt();
        int by2 = sc.nextInt();
        int mx1 = sc.nextInt();
        int my1 = sc.nextInt();
        int mx2 = sc.nextInt();
        int my2 = sc.nextInt();

        Coloring(ax1, ay1, ax2, ay2);
        Coloring(bx1, by1, bx2, by2);
        Coloring(mx1, my1, mx2, my2);

        int cnt = 0;
        for(int i = 0; i < rectangle.length; i++)
        {
            for(int j = 0; j < rectangle[i].length; j++)
            {
                if(rectangle[i][j] == 1) cnt++;
                if(rectangle[i][j] == 2) cnt++;
            }
        }

        System.out.println(cnt);
    }
}