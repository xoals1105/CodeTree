import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        String string = scanner.next();
        char find_char = scanner.next().charAt(0);
        int length = string.length();
        int found = -1;
        boolean bool_found = false;

        for(int i = 0; i < length; i++)
        {
            if(string.charAt(i) == find_char) 
            {
                found = i;
                bool_found = true;
                break;
            }
        }

        System.out.println(bool_found ? found : "No");
    }
}