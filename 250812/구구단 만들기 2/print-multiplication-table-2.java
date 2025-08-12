import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for (int i = 2; i < 9; i+=2)
        {
            for (int j = b; j >= a; j--)
            {
                System.out.print(j + " * " + i + " = " + (j * i));

                if (j > a)
                    System.out.print(" / ");

                if (a == 1)
                    break;
            }
            System.out.println();
        }
    }
}