import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        String string = scanner.next();
        int len = string.length();

        string = string.substring(1, len) + string.substring(0, 1);

        System.out.println(string);
    }
}