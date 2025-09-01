import java.util.Scanner;
public class Main {

    public static void PrintStar(int n)
    {
        if(n == 0) return;

        for(int i = n; i > 0; i--)
            System.out.print("*" + " ");
        System.out.println();

        PrintStar(n - 1);

        for(int i = 0; i < n; i++)
            System.out.print("*" + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        PrintStar(n);
    }
}