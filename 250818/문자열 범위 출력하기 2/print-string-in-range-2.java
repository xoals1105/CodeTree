import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        String string = scanner.next();
        int num = scanner.nextInt();
        int cnt = 0;
        for(int i = string.length() - 1; i >= string.length() - num; i--)
        {
            if(cnt >= num)
                break;
            System.out.print(string.charAt(i));
            cnt++;
        }
    }
}