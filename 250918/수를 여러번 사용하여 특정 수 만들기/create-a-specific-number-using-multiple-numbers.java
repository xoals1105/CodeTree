import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
    
        System.out.println(SpecificNumber(A, B, C));
    }

    private static int SpecificNumber(int A, int B, int C)
    {
        int answer = 0;
        for(int i = 0; i <= 1000; i++)
        {
            int num = 0;
            for(int j = 0; j <= 1000; j++)
                if((A * i) + (B * j) <= C)
                    num = (A * i) + (B * j);

            answer = Math.max(answer, num);

            num = 0;
             for(int j = 0; j <= 1000; j++)
                if((A * j) + (B * i) <= C)
                    num = (A * j) + (B * i); 

            answer = Math.max(answer, num);          
        }

        return answer;
    }
}