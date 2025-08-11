import java.util.Scanner;

public class Main 
{
    public static int gcd(int num1, int num2)
    {
        while(num2 != 0)
        {
            int temp = num1 % num2;
            num1 = num2;
            num2 = temp;
        }
        return num1;
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int gcdVal = gcd(1920, 2880);
        boolean found = false;

        for (int i = a; i <= b; i++)
        {
            if (gcdVal % i == 0)
            {
                found = true;
                break;
            }
        }

        System.out.println(found ? "1" : "0");        


    }
}  