import java.util.Scanner;
public class Main {

    public static final int INT_MIN = Integer.MIN_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] firstArr = new int[n];
        int[] secondArr = new int[n];
        for(int i = 0; i < n; i++){
            firstArr[i] = sc.nextInt();
            secondArr[i] = sc.nextInt();
        }

        int cnt = 0;
        for(int i = 0; i < n; i++)
        {
            if(firstArr[i] == 1 && secondArr[i] == 3)
                cnt++;
            if(firstArr[i] == 2 && secondArr[i] == 1)
                cnt++;
            if(firstArr[i] == 3 && secondArr[i] == 2)
                cnt++;
        }

        System.out.println(cnt);
    }
}