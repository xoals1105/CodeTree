import java.util.Scanner;

public class Main {

    public static final int MAX_N = 100;
    
    public static int[] cow = new int[MAX_N];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;

        for (int i = 0; i < n; i++)
            cow[i] = sc.nextInt();

        for(int i = 0; i < n; i++)
        {
            for(int j = i + 1; j < n; j++)
            {
                for(int k = j + 1; k < n; k++)
                {
                    if(cow[i] <= cow[j] && cow[j] <= cow[k])
                        cnt++;
                }
            }
        }

        System.out.println(cnt);
    }
}