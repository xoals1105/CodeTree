import java.util.Scanner;
public class Main {

    public static int[] arr = new int[100];
    
    public static int OddEvenCal(int m)
    {
        int sum = 0;

        while(m > 0)
        {
            if(m % 2 == 0)
            {
                sum += arr[m];
                m /= 2;
            }

            else
            {
                sum += arr[m];
                m -= 1;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 1; i <= n; i++)
            arr[i] = sc.nextInt();

        System.out.println(OddEvenCal(m));
    }
}