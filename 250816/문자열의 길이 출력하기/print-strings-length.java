import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        String fisrt_string = scanner.next();
        String second_string = scanner.next();

        System.out.println(fisrt_string.length() + second_string.length());
    }
}