import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        
        int num = scanner.nextInt();

        boolean found = true;
        for (int i = 2; i < num; i++)
        {
            if (num % i == 0)
            {
                found = false;
                break;
            }
        }

        System.out.println(found ? "P" : "C");
    }
}