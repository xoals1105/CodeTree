import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        String[] arr = new String[1];

        arr[0] = scanner.next();
        
        int len = arr[0].length();
        for(int i = 0; i < len; i++)
            System.out.println(arr[0].charAt(i));
    }
}