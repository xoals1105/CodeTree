import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        String string = scanner.next();

        char[] arr = string.toCharArray();

        arr[1] = 'a';
        arr[arr.length - 2] = 'a';

        string = String.valueOf(arr);

        System.out.println(string);
    }
}