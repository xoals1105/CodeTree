import java.util.Scanner;


public class Main {

    public static final int MAX = 1000000;

    public static int[] robotA = new int[MAX];
    public static int[] robotB = new int[MAX];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int locationA = 1;        
        for (int i = 0; i < n; i++) 
        {
            int t = sc.nextInt();
            char d = sc.next().charAt(0);

            for(int j = 0; j < t; j++)
            {
                switch(d)
                {
                    case 'L':
                        robotA[locationA] = robotA[locationA - 1] - 1;
                        break;

                    case 'R':
                        robotA[locationA] = robotA[locationA - 1] + 1;
                        break;
                }

                locationA++;
            }
        }
        
        int locationB = 1;        
        for (int i = 0; i < m; i++) 
        {
            int t = sc.nextInt();
            char d = sc.next().charAt(0);

            for(int j = 0; j < t; j++)
            {
                switch(d)
                {
                    case 'L':
                        robotB[locationB] = robotB[locationB - 1] - 1;
                        break;

                    case 'R':
                        robotB[locationB] = robotB[locationB - 1] + 1;
                        break;
                }

                locationB++;
            }
        }

        int cnt = 0;
        for(int i = 1; i < MAX; i++)
        {
            if((robotA[i] == robotB[i]) && (robotA[i - 1] != robotB[i - 1]))
            {
                cnt++;
            } 
        }
        
        System.out.println(cnt);
    }
}