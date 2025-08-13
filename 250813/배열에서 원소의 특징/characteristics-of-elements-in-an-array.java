import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[10];
        int num = 0;
        for(int i = 0; i < 10; i++)
        {
            arr[i] = scanner.nextInt();

            if(arr[i] % 3 == 0)
            {
                num = i;
                break;
            }
        }
        System.out.print(arr[num - 1]);
    }
}