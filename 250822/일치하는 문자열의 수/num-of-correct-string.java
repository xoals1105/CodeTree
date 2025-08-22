import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String a = scanner.next();
        int cnt = 0;

        for(int i = 0; i < n; i++)
        {
            String string = scanner.next();

            if(a.equals(string)) cnt++;
        }

        System.out.println(cnt);
    }
}