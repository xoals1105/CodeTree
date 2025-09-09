import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
    
        int sum = 0;
        for(int i = 0; i < str.length(); i++)
        {
            int cnt = 0;
            for(int j = i + 1; j < str.length(); j++)
            {
                if(str.charAt(i) == '(')
                    if(str.charAt(j) == ')')
                        cnt++;
                
            }
            sum += cnt;
        }

        System.out.println(sum);
    }
}