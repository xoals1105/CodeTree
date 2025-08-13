import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int Square = 0;
    
        for(int i = 0; i < n; i++)
        {
            arr[i] = scanner.nextInt();
            arr[i] *= arr[i];        
        }

        for(int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}