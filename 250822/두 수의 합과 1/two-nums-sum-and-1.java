import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        String sum = Integer.toString(a + b);
        int length = sum.length();
        int cnt = 0;
        for(int i = 0; i < length; i++)
            if(sum.charAt(i) == '1') cnt++;
        
        System.out.println(cnt);
    }
}