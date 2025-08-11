import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean found = false;

        for (int i = a; i <= b; i++)
        {
            if(i % c == 0)
            {
                found = true;
                break;
            }
        }    

        System.out.println(found ? "NO" : "YES");


    }
}