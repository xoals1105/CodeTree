import java.util.Scanner;
public class Main {

    public static final int INT_MAX = Integer.MAX_VALUE;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
    
        int answer = INT_MAX;
        for(int i = 0; i < n; i++)
        {
            int roomDistance = 0;
            int roomNum = i;
            int sumDistace = 0;
            while(n-- > 0)
            {
                if(roomNum == n)
                    roomNum = 0;
                sumDistace += arr[roomNum] * roomDistance;
                roomNum++;
                roomDistance++;
            }
            answer = Math.min(answer, sumDistace);
        }

        System.out.println(answer);
    }
}