import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        String a = scanner.next();
        String b = scanner.next();

        boolean found = true;
        int a_len = a.length();
        int b_len = b.length();

        while(found)
        {
            found = false;
            for(int i = 0; i <= a_len - b_len; i++)
            {
                if(a.substring(i, i + b_len).equals(b))
                {
                    a = a.substring(0, i) + a.substring(i + b_len);
                    a_len = a.length();
                    found = true;
                }
            }
        }

        System.out.println(a);
    }
}