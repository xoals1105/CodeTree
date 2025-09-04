import java.util.Scanner;
public class Main {

    public static int numOfDays(int m, int d)
    {
        int[] dayOfMonths = new int[] {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int day = 0;
        for(int i = 1; i < m; i++)
        {
            day += dayOfMonths[i];
        }

        day += d;

        return day;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
    
        System.out.println(numOfDays(m2, d2) - numOfDays(m1, d1) + 1);
    }
}