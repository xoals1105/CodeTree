import java.util.Scanner;
public class Main {
    
    public static final int INT_MAX = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
    
        int answer = Math.abs(A - B);

        int walkAX = Math.abs(A - x);
        int walkAY = Math.abs(A - y);

        int walkYB = Math.abs(B - y);
        int walkXB = Math.abs(B - x);

        int disFirst = walkAX + walkYB;
        int disSecond = walkAY + walkXB;

        answer = Math.min(answer, Math.min(disFirst, disSecond));

        System.out.println(answer);
    }
}