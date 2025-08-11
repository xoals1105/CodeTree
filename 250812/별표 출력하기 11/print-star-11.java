import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int printStar = (n * 2) + 1;
        for (int i = 0; i < printStar; i++)
            {

                for (int j = 0; j < printStar; j++)

                    if(i % 2 == 0 || j % 2 == 0)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                System.out.println();
            }
    }
}