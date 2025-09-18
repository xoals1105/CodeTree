import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();

        for (int len = 1; len <= n; len++) {
            boolean hasDuplicate = false;

            // 길이 len짜리 부분 문자열 시작 위치 i
            for (int i = 0; i + len <= n; i++) {
                String a = str.substring(i, i + len);

                // 그 다음 위치 j부터 비교
                for (int j = i + 1; j + len <= n; j++) {
                    String b = str.substring(j, j + len);

                    if (a.equals(b)) {
                        hasDuplicate = true;
                        break;
                    }
                }
                if (hasDuplicate) break;
            }

            if (!hasDuplicate) {
                System.out.println(len);
                return;
            }
        }
    }
}
