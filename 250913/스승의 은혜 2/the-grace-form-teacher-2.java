import java.util.Scanner;
public class Main {

    public static final int INT_MIN = Integer.MIN_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }


        int answer = INT_MIN;
        for(int i = 0; i < n; i++)
        {
            int giftableStudent = 1;
            int student = p[i] / 2;
            for(int j = 0; j < n; j++)
            {
                if(i == j)
                    continue;
                    
                student += p[j];
                if(student > b)
                    break;
                giftableStudent++;
            }

            answer = Math.max(answer, giftableStudent);
        }

        System.out.println(answer);
    }
}