import java.util.Scanner;
public class Main {
    
    public static final int MAX_NUM = 100;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x1 = new int[n];
        int[] x2 = new int[n];
        for(int i = 0; i < n; i++)
        {
            x1[i] = sc.nextInt();
            x2[i] = sc.nextInt();
        }

        if(FindSegment(x1, x2))
            System.out.println("Yes");
        else    
            System.out.println("No");
    }

    private static boolean FindSegment(int[] x1, int[] x2)
    {
        boolean find = true;
        for(int i = 0; i < x1.length; i++)
            for(int j = i + 1; j < x1.length; j++)
            {
                if(x2[i] < x1[j] || x2[j] < x1[i])
                    find = false;
                
            }
        
        return find;
    }
}