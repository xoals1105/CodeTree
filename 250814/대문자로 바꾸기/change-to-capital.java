import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        char[][] arr = new char[5][3];

        for(int i = 0; i < 5; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                arr[i][j] = scanner.next().charAt(0);
                arr[i][j] = (char)(arr[i][j] - 32);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}