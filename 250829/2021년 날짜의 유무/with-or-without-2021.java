import java.util.Scanner;
public class Main {

    public static boolean Find_2021Year(int m, int d)
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int d = sc.nextInt();
    
        if(Find_2021Year(m, d))
            System.out.println("Yes");
        else    
            System.out.println("No");
    }
}