import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 공백을 포함한 문자열을 입력받습니다.
        String str = sc.nextLine();
        
        // 소문자 알파벳을 입력받습니다.
        char a = sc.next().charAt(0);

        // 문자열의 길이를 확인합니다.
	    int len = str.length();
	    int cnt = 0;

        // 문자열에서 주어진 알파벳이 몇번 나오는지 확인합니다.
        for(int i = 0; i < len; i++)
            if(str.charAt(i) == a)
                cnt++;
        
        // 주어진 알파벳이 나온 횟수를 출력합니다.
	    System.out.print(cnt);
    }
}
