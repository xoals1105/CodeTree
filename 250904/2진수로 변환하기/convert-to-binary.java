import java.util.Scanner;
public class Main {

    public static int cnt = 0;

    public static int[] BinaryConversion(int n)
    {
        int[] digits = new int[50000];
        
        while(true)
        {
            if(n < 2)
            {
                digits[cnt++] = n;
                break;
            }

            digits[cnt++] = n % 2;
            n /= 2;
        }

        return digits;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] box = new int[50000];

        box = BinaryConversion(n);

        for(int i = cnt - 1; i >= 0; i--)
            System.out.print(box[i]);
    }
}