import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        int person = scanner.nextInt();
        int pass_count = 0;
        int[] arr = new int[4];
        for (int i = 0; i < person; i++)
        {
          
            int sum = 0;
            int cnt = 0;

            for(int j = 0; j < 4; j++)
            {
                arr[j] = scanner.nextInt();
                sum += arr[j];
                cnt++;
            }
            
            int avg = sum / cnt;
            
            if(avg >= 60)
            { 
                System.out.println("pass");
                pass_count++;
            }
            else System.out.println("fail");
        }

        System.out.println(pass_count);
    }
}