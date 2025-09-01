import java.util.Scanner;

public class Main {

    public static int Calculation(int n)
    {
        if(n == 1) return 1;
        else if(n == 2) return 2;
    
        return Calculation(n - 2) + n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    
        System.out.println(Calculation(n));
    }
}