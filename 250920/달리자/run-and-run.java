import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        int answer = 0;
        int dis = 0;
        for(int i = n - 1; i >= 0; i--)
        {   
            int needNum = b[i] - a[i];
            for(int j = i - 1; j >= 0; j--)
            {
               
                int distanceCnt = 0;         
                for(int k = 0; k < b[j]; k++)
                {
                    if(b[j] == 0 || needNum == 0)
                        break;
                    needNum--;
                    b[j]--;
                    distanceCnt++;
                }

                dis += (i - j) * distanceCnt;
            }
        }
        System.out.println(dis - 1);
    }
}