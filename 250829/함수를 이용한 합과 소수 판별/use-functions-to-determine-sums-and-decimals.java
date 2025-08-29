import java.util.Scanner;
public class Main {

    public static boolean isAllEven(int num)
    {

        int sum = 0;
        while(num > 0)
        {
            sum += (num % 10);
            num /= 10;
        }

        if(sum % 2 == 0)
            return true;
        else
            return false;
    }

      public static boolean isPrime(int n) {
        if(n == 1)
            return false;
            
        for(int i = 2; i < n; i++)
            if(n % i == 0)
                return false;
        
        return true;
    }
        public static boolean judgeNum(int n) {
        if(isPrime(n) && isAllEven(n))
            return true;
        
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;

        for(int i = a; i <= b; i++)
        {
            if(judgeNum(i))
                cnt++;
        }

        System.out.println(cnt);
    }
}