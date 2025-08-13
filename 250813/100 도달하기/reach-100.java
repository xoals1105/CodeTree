import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[100];
        arr[0] = 1;
        arr[1] = scanner.nextInt();

        System.out.print(arr[0] + " " + arr[1] + " ");
        for(int i = 2; i < 100; i++)
        {
            arr[i] = arr[i - 1] + arr[i - 2];
            System.out.print(arr[i] + " ");

            if (arr[i] > 100)
                break;
        }
    }
}