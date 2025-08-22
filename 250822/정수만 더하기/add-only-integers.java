import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        String string = scanner.next();
        int len = string.length();
        int sum = 0;

        for(int i = 0; i < len; i++)
        {
            if(string.charAt(i) >= '0' && string.charAt(i) <= '9') sum += (string.charAt(i)- '0');
        }
        System.out.println(sum);
    }
}