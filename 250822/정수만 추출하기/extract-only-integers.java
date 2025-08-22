import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        String string1 = scanner.next();
        String string2 = scanner.next();

        int len1 = string1.length();
        int len2 = string2.length();

        String a = "";
        String b = "";
        for(int i = 0; i < len1; i++)
        {
            if(string1.charAt(i) >= '0' && string1.charAt(i) <= '9') a += string1.charAt(i);
            else break;
        }

        
        for(int i = 0; i < len2; i++)
        {
            if(string2.charAt(i) >= '0' && string2.charAt(i) <= '9') b += string2.charAt(i);
            else break;
        }

        System.out.println(Integer.parseInt(a) + Integer.parseInt(b));
    }
}