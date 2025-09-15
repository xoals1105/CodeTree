import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] bombs = new int[n];
        for (int i = 0; i < n; i++) {
            bombs[i] = sc.nextInt();
        }

        int answer = -1;
        for(int i = 0; i < n; i++)
        {
            boolean find = false;
            for(int j = 1; j <= k; j++)
            {
                if(i + j >= n) 
                    break;

                // for(int q = 1; q <= k; q++)
                // {
                //     if(bombs[])
                // }

                if(bombs[i] == bombs[i + j])
                    find = true;
            }

            if(find)
                answer = Math.max(answer, bombs[i]);
        }
        System.out.println(answer);
    }
}