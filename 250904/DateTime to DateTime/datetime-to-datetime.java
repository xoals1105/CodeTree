import java.util.Scanner;
public class Main {

    public static int DateTime(int A, int B, int C)
    {

        if(A < 11) return -1;
        int initialMin = (11 * 1440) + (11 * 60) + 11;
        int day = A * 1440;
        int time = B * 60;
        int min = C;

        return (day + time + min) - initialMin;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
    
        System.out.println(DateTime(A, B, C));
    }
}