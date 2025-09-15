import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int[] p = new int[n];
        int[] s = new int[n];
        for(int i = 0; i < n; i++){
            p[i] = sc.nextInt();
            s[i] = sc.nextInt();
        }

        int answer = -1;
        for(int i = 0; i < n; i++)
        {
            int gift = 0;
            int personCnt = 0;
            for(int j = 0; j < n; j++)
            {
                if(i == j)
                    gift += (p[i] / 2) + s[i];
                else
                    gift += p[j] + s[j];

                if(gift > b)
                    break;
                personCnt++;
            }

            answer = Math.max(answer, personCnt);
        }

        System.out.println(answer);
    }
}