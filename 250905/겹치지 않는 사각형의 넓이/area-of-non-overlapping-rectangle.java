import java.util.Scanner;

public class Main {
    private static final int N = 3;          // 직사각형 개수
    private static final int MAX_R = 2000;   // 격자 크기
    private static final int OFFSET = 1000;  // 좌표 보정값 (상수)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] x1 = new int[N];
        int[] y1 = new int[N];
        int[] x2 = new int[N];
        int[] y2 = new int[N];

        // 입력 처리
        for (int i = 0; i < N; i++) {
            x1[i] = sc.nextInt() + OFFSET;
            y1[i] = sc.nextInt() + OFFSET;
            x2[i] = sc.nextInt() + OFFSET;
            y2[i] = sc.nextInt() + OFFSET;
        }

        int result = calculateArea(x1, y1, x2, y2);
        System.out.println(result);
    }

    // 면적 계산 메서드
    private static int calculateArea(int[] x1, int[] y1, int[] x2, int[] y2) {
        int[][] checked = new int[MAX_R + 1][MAX_R + 1];

        // 직사각형에 1, 2, 3 번호 붙여 체크
        for (int i = 0; i < N; i++) {
            for (int x = x1[i]; x < x2[i]; x++) {
                for (int y = y1[i]; y < y2[i]; y++) {
                    checked[x][y] = i + 1;
                }
            }
        }

        // A, B만 남아있는 영역(= 1, 2) 넓이 계산
        int area = 0;
        for (int x = 0; x <= MAX_R; x++) {
            for (int y = 0; y <= MAX_R; y++) {
                if (checked[x][y] == 1 || checked[x][y] == 2) {
                    area++;
                }
            }
        }

        return area;
    }
}
