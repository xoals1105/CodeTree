import java.util.Scanner;
public class Main {

    public static final int INT_MAX = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        int sum = 0;
        for(int i = 0; i < 5; i++)
        {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        int answer = INT_MAX;
        for(int i = 0; i < 5; i++)
            for(int j = i+1; j < 5; j++)
                for(int k = 0; k < 5; k++)
                    for(int q = k+1; q < 5; q++)
                    {
                        if(i == k || j == k || i == q || j == q)
                            continue;
                        // System.out.println(answer);
                        answer = Math.min(answer, GetDiff(sum, arr[i], arr[j], arr[k], arr[q]));
                    }    
        
        if(answer == INT_MAX)
            System.out.println("-1");
        else
            System.out.println(answer);   
    }
    
    private static int GetDiff(int sum, int i, int j, int k, int q)
    {
        int teamA = i + j;
        int teamB = k + q;
        int teamC = sum - teamA - teamB;

        if(teamA == teamB || teamB == teamC || teamA == teamC)
            return INT_MAX;    
        int diff = Math.abs(teamA - teamB);
        diff = Math.max(diff, Math.abs(teamB - teamC));
        diff = Math.max(diff, Math.abs(teamA - teamC));

        return diff;
    }
}