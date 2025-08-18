import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String sum = "";

        for(int i = 0; i < n; i++)
        {
            String string = scanner.next();
            sum += string;
        }

        System.out.println(sum);
    }
}