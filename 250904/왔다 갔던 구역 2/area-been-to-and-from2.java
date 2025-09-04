import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] digits = new int[600];
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            char dir = sc.next().charAt(0);
            int initialDistance = 300;

            for(int j = 0; j < x; j++)
            {
            switch(dir)
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

        System.out.println(cnt - 1);
    }
}