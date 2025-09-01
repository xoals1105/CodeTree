import java.util.Scanner;
public class Main {

    public static int cnt = 0;

    public static int Calculation(int n)
    {
        if(n == 1) return 1;

        if(n % 2 == 0)
            Calculation(n / 2);
        else
            Calculation(n * 3 + 1);
        cnt++;
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    
        System.out.println(Calculation(n));
    }
}