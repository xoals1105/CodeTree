import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] penalizedPerson = new int[m];
        boolean check = false;
        int num = 0;
        for (int i = 0; i < m; i++) 
        {
            penalizedPerson[i] = sc.nextInt();
        }

        for(int i = 1; i <= n; i++)
        {
            int cnt = 0;
            for(int j = 0; j < m; j++)
            {
                if(penalizedPerson[j] == i) cnt++;
                if(cnt == k)
                {
                    check = true; 
                    num = i;
                    break;
                }
            }
        }

        System.out.println(check ? num : "-1");
        
    }
}