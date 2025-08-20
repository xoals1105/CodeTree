import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        String a = scanner.next();
        String request = scanner.next();

        int a_len = a.length();
        int b_len = request.length();

        char[] b_arr = request.toCharArray();

        for(int i = 0; i < b_len; i++)
        {
            switch(b_arr[i])
            {
                case 'L':
                    a = a.substring(1, a_len) + a.substring(0, 1);
                    break;
                case 'R':
                    a = a.substring(a_len - 1, a_len) + a.substring(0, a_len -1);
                    break;
            }    
        }

        System.out.println(a);

    }
}