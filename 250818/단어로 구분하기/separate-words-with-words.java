import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        String[] arr = new String[10];

        for(int i = 0; i < 10; i++)
        {
            arr[i] = scanner.next();
            System.out.println(arr[i]);
        }
    }
}