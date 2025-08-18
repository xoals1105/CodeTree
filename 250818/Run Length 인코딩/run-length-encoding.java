import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        String string = scanner.next();
        String a_string = "";
        int len = string.length();
        int cnt = 1;
        int last = 1;
        for(int i = 0; i < len - 1; i++)
        {
            if(string.charAt(i) != string.charAt(i + 1))
            {
                a_string += string.charAt(i);
                a_string += cnt;
                cnt = 0;
            }

            if(last == len - 1)
            {
                a_string += string.charAt(len - 1);
                a_string += cnt + 1;
            }

            last++;
            cnt++;
        }

        System.out.println(a_string.length());
        System.out.println(a_string);
    }
}