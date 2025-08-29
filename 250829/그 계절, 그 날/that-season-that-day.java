import java.util.Scanner;
public class Main {
 
    public static boolean ExistYear(int y)
    {

        if (y % 4 != 0) return false;
        if (y % 100 == 0) return false;
        if (y % 100 == 0 && y % 400 != 0) return false;
        
        return true;   
    }

    public static boolean CheckDate(int y, int m, int d)
    {
        if (y <= 0 || y >= 3001) return false;

        if(ExistYear(y))
        {
            if(m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12)
            {
                if(d > 0 && d <= 31)
                return true;
            }
            else if(m == 4 || m == 6 || m == 9 || m == 11)
            {
                if(d > 0 && d <= 30)
                return true;
            }
            else if(m == 2)
            {
                if(d > 0 && d <= 29)
                return true;
            }

            return false;
        }

        else
        {
            if(m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12)
            {
                if(d > 0 && d <= 31)
                return true;
            }
            else if(m == 4 || m == 6 || m == 9 || m == 11)
            {
                if(d > 0 && d <= 30)
                return true;
            }
            else if(m == 2)
            {
                if(d > 0 && d <= 28)
                return true;
            }

            return false;
        }
    }

    public static String FindSeason(int m)
    {
        if(m >= 3 && m <= 5)
            return "Spring";
        if(m >= 6 && m <= 8)
            return "Summer";
        if(m >= 9 && m <= 11)
            return "Fall";
        return "Winter";
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
    
        if(CheckDate(y, m, d))       
            System.out.println(FindSeason(m));
        else
            System.out.println("-1");       
    }
}