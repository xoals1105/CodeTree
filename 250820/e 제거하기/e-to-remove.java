import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        String string = scanner.next();

        int len = string.length();

        for(int i = 0; i < len; i++)
        {
            if(string.charAt(i) == 'e')
            {
                string = string.substring(0, i) + string.substring(i + 1);
                break;
            }
        }

        System.out.println(string);
    }
}