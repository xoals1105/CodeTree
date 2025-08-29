import java.util.Scanner;
public class Main {

    public static boolean isMagicNumber(int num)
    {
        return (num / 10 == 3) || (num % 10 == 3) || (num / 10 == 6) || (num % 10 == 6) || (num / 10 == 9) || (num % 10 == 9) || num % 3 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int cnt = 0;

        for(int i = A; i <= B; i++)
        {
            if(isMagicNumber(i))
                cnt++;
        }

        System.out.println(cnt);
    }
}