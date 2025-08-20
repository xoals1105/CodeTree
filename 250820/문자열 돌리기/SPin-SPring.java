import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        String string = scanner.next();
        int len = string.length();
        int cnt = len;
        System.out.println(string);
        
        while(cnt != 0)
        {
            string = string.substring(len - 1, len) + string.substring(0, len - 1);
            cnt--;
            System.out.println(string);
        }
        
    }
}