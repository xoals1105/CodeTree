import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 문자열을 입력받습니다.
        String str = sc.next();

        // 문자열의 길이를 구합니다.
        int len = str.length();

        // 문자가 하나 남을 때까지 반복합니다.
        while(len > 1) 
        {
            int a = sc.nextInt();

            if(a >= len)
                a = len - 1;

                 
            str = str.substring(0, a) + str.substring(a + 1);
            len--;

            System.out.println(str);
              
        }
    }
}
