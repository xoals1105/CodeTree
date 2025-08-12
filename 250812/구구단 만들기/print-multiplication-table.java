import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for (int i = 1; i < 10; i++)
        {
            for (int j = b; j >= a; j-=2)
            {
                System.out.print(j + " * " + i + " = " + (j * i));

                if (j > a)
                    System.out.print(" / ");
            }
            System.out.println();
        }
    }
}