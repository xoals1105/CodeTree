import java.util.Scanner;

public class Main {

    public static int numOfday(int m, int d)
    {
        int[] dayOfMonth = new int[] {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int totalDay = 0;
        for(int i = 1; i < m; i++)
        {
            totalDay += dayOfMonth[i];
        } 
        return totalDay += d;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        String A = sc.next();
    
        int diff = numOfday(m2, d2) - numOfday(m1, d1);

        String[] dayOfWeek = new String[] {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        int cnt = 0;
        int day = 1;
        for(int i = 0; i < diff; i++)
        {
            if(day == 7) day = 0;
            if(A.equals(dayOfWeek[day])) cnt++;
            day++;
        }

        System.out.println(cnt);
    }
}