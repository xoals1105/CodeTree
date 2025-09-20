import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
    
        int distance = AreaClear(a, b, c, d);

        System.out.println(distance);
    }

    private static int AreaClear(int a, int b, int c, int d)
    {
        int distance = 0;
        if(b < c || d < a)
        {
            distance = (Math.abs(b - a) + Math.abs(d - c));
        }
        else
        {
            int x1 = Math.min(a, c);
            int x2 = Math.max(b, d);

            distance = Math.abs(x2 - x1);
        }

        return distance;
    }
}