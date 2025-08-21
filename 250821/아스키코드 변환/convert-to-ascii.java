import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        char a = scanner.next().charAt(0);
        int b = scanner.nextInt();

        System.out.print((int) a + " ");
        System.out.print((char) b);
    }
}