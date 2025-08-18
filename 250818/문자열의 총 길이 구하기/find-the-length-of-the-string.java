import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        String[] arr = new String[10];
        int sum = 0;
        for(int i = 0; i < 10; i++)
        {
            arr[i] = scanner.next();
            sum += arr[i].length();
        }

        System.out.println(sum);


    }
}