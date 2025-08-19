import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        String inputString = scanner.next();
        String targetString = scanner.next();
        int cnt = 0;
        int length = inputString.length();

        for(int i = 0; i < length - 1; i++)
        {
            if(inputString.substring(i, i + 2).equals(targetString)) cnt++;
        }

        System.out.println(cnt);
    }
}