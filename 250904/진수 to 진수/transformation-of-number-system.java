import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        String N = sc.next();
    
        int num = 0;
        for(int i = 0; i < N.length(); i++)
            num = num * A + (N.charAt(i) - '0');
        
        int cnt = 0;
        int[] digits = new int[100];

        while(true)
        {
            if(num < B)
            {
                digits[cnt] = num;
                break;
            }

            digits[cnt++] = num % B;
            num /= B;
        }

        for(int i = cnt; i >= 0; i--)
            System.out.print(digits[i]);
    
    }
}