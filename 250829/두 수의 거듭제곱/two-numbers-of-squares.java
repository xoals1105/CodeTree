import java.util.Scanner;

public class Main {

    public static int Calculation(int a, int b)
    {
        int sum = 1;
        for(int i = 1; i <= b; i++)
            sum *= a;
        
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        System.out.println(Calculation(a, b));
    }
}