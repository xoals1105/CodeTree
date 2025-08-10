import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        boolean finder = false;
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        for (int i = a; i <= b; i++)
        {
            if( i % c == 0)
            {
                finder = true;
                break;
            }
        }

        if (finder == true) System.out.println("YES");

        else System.out.println("NO");
      

    }
}