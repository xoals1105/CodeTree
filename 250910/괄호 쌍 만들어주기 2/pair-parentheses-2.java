import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
    
        int cnt = 0;
        for(int i = 0; i < input.length(); i++)
        {
            for(int j = i + 2; j < input.length() - 1; j++)
            {
                if((input.charAt(i) == '(') && (input.charAt(i + 1) == '(') && (input.charAt(j) == ')') && input.charAt(j + 1) == ')')
                    cnt++;
            }
        }

        System.out.println(cnt);
    }
}