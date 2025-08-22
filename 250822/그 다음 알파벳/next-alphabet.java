import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        char alphabet = scanner.next().charAt(0);

        if(alphabet == 'z') System.out.println('a');
        else System.out.println(++alphabet);
    }
}