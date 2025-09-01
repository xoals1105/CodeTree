import java.util.Scanner;

public class Main {

    public static int[] arr = new int[10];

    public static int Gcd(int a, int b)
    {
        while(b != 0)
        {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int Lcm(int a, int b)
    {
        return a * b / Gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
    
        int l = arr[0];
        for(int i = 1; i < n; i++)
            l = Lcm(l, arr[i]);

        System.out.println(l);
    }
}