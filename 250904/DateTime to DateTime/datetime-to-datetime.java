import java.util.Scanner;
public class Main {

    public static int DateTime(int A, int B, int C)
    {
        int day = (A - 11) * 1440;
        int time = (B - 11) * 60;
        int min = C - 11;

        return day + time + min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
    
        System.out.println(DateTime(A, B, C));
    }
}