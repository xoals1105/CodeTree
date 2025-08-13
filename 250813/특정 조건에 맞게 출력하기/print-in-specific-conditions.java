import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[100];

        for(int i = 0; i < 100; i++)
        {
            arr[i] = scanner.nextInt();

            if(arr[i] == 0) break;
        }

        for(int i = 0; i < 100; i++)
        {
            if(arr[i] == 0) break;

            else if(arr[i] % 2 != 0)
                System.out.print(arr[i] + 3 + " ");
            else
                System.out.print(arr[i] / 2 + " ");
            
        }
    }
}