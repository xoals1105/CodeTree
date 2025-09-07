import java.util.Scanner;


public class Main {

    public static final int MAX = 10000000;

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
        int l = Math.max(locationA, locationB);
        int A = 1;
        int B = 1;
        boolean boolA = false;
        boolean boolB = false;

        for(int i = 1; i < l; i++)
        {
            if((robotA[A] == robotB[B]) && ((robotA[A - 1] != robotB[B - 1]) || boolA || boolB))       
                cnt++;
    
            if(A != locationA - 1) A++;
            else boolA = true;
            if(B != locationB - 1) B++; 
            else boolB = true;
           
        }
        
        System.out.println(cnt);
    }
}