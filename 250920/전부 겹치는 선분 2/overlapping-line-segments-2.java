import java.util.Scanner;

public class Main {

    public static final int INT_MAX = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x1 = new int[n];
        int[] x2 = new int[n];
        for (int i = 0; i < n; i++) {
            x1[i] = sc.nextInt();
            x2[i] = sc.nextInt();
        }

        if(Find(x1, x2))
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    private static boolean Find(int[] x1, int[] x2)
    {
        int max_x1 = 0;
        int min_x2 = INT_MAX;
        for(int i = 0; i < x1.length; i++)
        {
            for(int j = 0; j < x1.length; j++)
            {
                if(i == j)
                    continue;

                int xl = x1[j];
                int xr = x2[j];
                max_x1 = Math.max(max_x1, xl);
                min_x2 = Math.min(min_x2, xr);
            }

            if(min_x2 > max_x1)
                return false;
        }

        return true;
    }
}