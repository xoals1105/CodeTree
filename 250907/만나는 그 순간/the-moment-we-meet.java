import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        List<Integer> positionsA = simulateMoves(sc, n);
        List<Integer> positionsB = simulateMoves(sc, m);

        int meetTime = findFirstMeetTime(positionsA, positionsB);
        System.out.println(meetTime);
    }

    // 이동 시뮬레이션
    private static List<Integer> simulateMoves(Scanner sc, int moveCount) {
        List<Integer> positions = new ArrayList<>();
        positions.add(0); // 초기 위치 (시간 0)

        for (int i = 0; i < moveCount; i++) {
            char direction = sc.next().charAt(0);
            int duration = sc.nextInt();

            for (int t = 0; t < duration; t++) {
                int lastPos = positions.get(positions.size() - 1);
                int newPos = (direction == 'R') ? lastPos + 1 : lastPos - 1;
                positions.add(newPos);
            }
        }
        return positions;
    }

    // 최초로 만나는 시간 찾기
    private static int findFirstMeetTime(List<Integer> positionsA, List<Integer> positionsB) {
        int minTime = Math.min(positionsA.size(), positionsB.size());

        for (int t = 1; t < minTime; t++) {
            if (positionsA.get(t).equals(positionsB.get(t))) {
                return t;
            }
        }
        return -1; // 만나지 않음
    }
}
