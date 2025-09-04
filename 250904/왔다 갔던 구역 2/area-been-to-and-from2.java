import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] x = new int[N];
        int[] dir = new int[N];
        
        int[] digits = new int[N*10];
        for (int i = 0; i < N; i++) 
        {
            x[i] = sc.nextInt();
            dir[i] = sc.next().charAt(0);
        }

        int initialDistance = (N*10) / 2;
        for(int i = 0; i < N; i++)
        {
            for(int j = 0; j < x[i]; j++)
            {
                switch(dir[i])
                {
                    case 'L':  
                        digits[initialDistance] += 1;
                        initialDistance++;
                        break;
                    case 'R':
                        digits[initialDistance] += 1;  
                        initialDistance--;
                        break;
                }
            }
        }
        

        int cnt = 0;
        for(int i = 0; i < digits.length; i++)
        {
            if(digits[i] > 1) cnt++;
        }

        System.out.println(cnt);
    }
}