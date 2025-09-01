import java.util.Scanner;
public class Main {

    public static int SubNum(int mul)
    {
        int sum = 0;
        if(mul == 0) return 0;

        while(mul > 0)
        {
            sum += mul % 10;
            mul /= 10;
        }

        return sum;
    }

    public static int Calculation(int a, int b, int c)
    {
        int mul = a * b * c;

        return SubNum(mul);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
    
        System.out.println(Calculation(a, b, c));
    }
}