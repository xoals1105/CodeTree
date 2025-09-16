import java.util.Scanner;
public class Main {

    public static final int IN_MIN = Integer.MIN_VALUE;

    public static int maxSum(int x, int y)
    {
        int answer = IN_MIN;
        for(int i = x; i <= y; i++)
        {  
            int sum = 0;
            int temp = i;   
            while(temp > 0)
            {
                sum += temp % 10;
                temp /= 10; 
            }
            answer = Math.max(answer, sum);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
    
        System.out.println(maxSum(x, y));
    }
}