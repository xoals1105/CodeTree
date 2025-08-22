import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        String string = scanner.next();
        int len = string.length();

        for(int i = 0; i < len; i++)
        {
            if(string.charAt(i) >= 'a' && string.charAt(i) <= 'z') System.out.print((char)(string.charAt(i) - 'a' + 'A'));
            else if(string.charAt(i) >= 'A' && string.charAt(i) <= 'Z') System.out.print((char)(string.charAt(i) - 'A' + 'a'));
        }
    }
}