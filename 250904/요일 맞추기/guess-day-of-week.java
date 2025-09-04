import java.util.Scanner;

class InitialDay
{
    int month = 0;
    int day = 0;
    String dayOfWeek = "Mon";

    public InitialDay(int month, int day)
    {
        this.month = month;
        this.day = day;
    }
}

public class Main 
{
    public static String FindDay(int month, int day, int m, int d)
    {
        String[] dayOfWeek = new String[] {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        int[] dayOfMonth = new int[] {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if(month < m || (month == m && day < d))
        {
            int isDayOfWeek = 0;
            while(true)
            {
                if(month == m && day == d) break;

                if(dayOfWeek[isDayOfWeek].equals("Sun")) isDayOfWeek = -1;

                day++;
                isDayOfWeek++;

                if(day > dayOfMonth[month])
                {
                    month++;
                    day = 1;
                }
            }

            return dayOfWeek[isDayOfWeek];
        }

        else
        {
            int isDayOfWeek = 0;
            while(true)
            {
                if(month == m && day == d) break;

                if(dayOfWeek[isDayOfWeek].equals("Mon")) isDayOfWeek = 7;

                day--;
                isDayOfWeek--;

                if(day < 0)
                {
                    month--;
                    day = dayOfMonth[month] - 1;
                }
            }

            return dayOfWeek[isDayOfWeek];
        }
        
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
    
        InitialDay initialday = new InitialDay(m1, d1);

        System.out.println(FindDay(initialday.month, initialday.day, m2, d2));
    }
}