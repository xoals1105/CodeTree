import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        String string = scanner.next();

        string = string.substring(0, 1) + string.substring(2, string.length() - 2) + string.substring(string.length() - 1);

        System.out.println(string);
    }
}