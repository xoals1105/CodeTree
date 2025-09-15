import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int[] p = new int[n];
        int[] s = new int[1001];
        for(int i = 0; i < n; i++){
            p[i] = sc.nextInt();
            s[p[i]] = sc.nextInt();
        }

        Arrays.sort(p);

        int answer = -1;
        for(int i = 0; i < n; i++)
        {
            int gift = 1;
            int personCnt = 0;
            for(int j = 0; j < n; j++)
            {
                if(i == j)
                    gift += (p[i] / 2) + s[p[i]];
                else
                    gift += p[j] + s[p[j]];

                if(gift > b)
                    break;
                personCnt++;
            }

            answer = Math.max(answer, personCnt);
        }

        System.out.println(answer);
    }
}