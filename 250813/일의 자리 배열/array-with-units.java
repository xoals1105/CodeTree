import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        arr[0] = scanner.nextInt();
        arr[1] = scanner.nextInt();
 

        for(int i = 2; i < 10; i++)
        {
            arr[i] = (arr[i - 1] + arr[i - 2]) % 10;
        }

        for(int i = 0; i < 10; i++)
            System.out.print(arr[i] + " ");
        
    }
}