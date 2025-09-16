import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
    
        System.out.println(FindPalindrom(x, y));
    }

    private static int FindPalindrom(int x, int y)
    {
        int cnt = 0;

        for(int i = x; i <= y; i++)
        {
            // boolean find = true;
            // int temp = i;
            // while(find)
            // {
            //     if(!(temp / 10 == temp % 10))
            //         find = false;

            //     temp / 10;
            // }

            String temp = String.valueOf(i);
            boolean find = true;
            for(int j = 0; j < temp.length() / 2; j++)
                if(temp.charAt(j) != temp.charAt(temp.length() - j - 1))
                    find = false;

            if(find)
                cnt++;
        }

        return cnt;
    }
}