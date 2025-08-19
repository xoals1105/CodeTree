import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        String string = scanner.next();
        String found_string = scanner.next();

        int length = string.length();
        int found_length = found_string.length();
        int n = -1;

        for(int i = 0; i < length - found_length + 1; i++)
        {
            if(string.substring(i, i + found_length).equals(found_string))
            {
                n = i;
                break;
            }
        }

        System.out.println(n);
    }
}