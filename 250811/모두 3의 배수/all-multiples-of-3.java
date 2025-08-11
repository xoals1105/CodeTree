import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        int num5 = scanner.nextInt();

        boolean found = false;

        if (num1 % 3 == 0 && num2 % 3 == 0 && num3 % 3 == 0 && num4 % 3 == 0 && num5 % 3 == 0 )
        {
            found = true;
        }

        System.out.println(found ? "1" : "0");

    }
}