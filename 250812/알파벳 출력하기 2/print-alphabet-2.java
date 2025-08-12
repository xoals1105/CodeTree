import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        char alphabet = 'A';

        for (int i = 0; i < n; i++)
        {
            for(int j = 0; j < i; j++)
                System.out.print("  ");
            
            for(int j = i; j < n; j++)
            {
                System.out.print(alphabet + " ");
                alphabet++;

                if(alphabet > 'Z')
                    alphabet = 'A';
            }
            System.out.println();
        }
    }
}