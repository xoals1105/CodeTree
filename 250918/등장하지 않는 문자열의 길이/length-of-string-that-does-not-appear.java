import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        int num = str.length();
        char[] arr = new char[num];
        for(int i = 0; i < str.length(); i++)
            arr[i] = str.charAt(i);

        int cnt = 0;
        for(int i = 1; i <= num; i++)
        {
            String c = str.substring(0, i);
            for(int j = i; j <= num; j++)
            {
                if(i == j)
                    continue;

                String cc = str.substring(j - i, j);

                if(c.equals(cc)) 
                {
                    cnt++;
                }
            }
        }
        System.out.println(cnt + 1);
    }
}