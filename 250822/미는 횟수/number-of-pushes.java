import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        String a = scanner.next();
        String b = scanner.next();

        int cnt = 0;

        for(int i = 0 ; i < a.length(); i++)
        {
            a = a.substring(a.length() - 1, a.length()) + a.substring(0, a.length() - 1);
            cnt++;
            if(a.equals(b)) break;
        }

        if(cnt == a.length()) System.out.println("-1");
        else System.out.println(cnt);
    }
}