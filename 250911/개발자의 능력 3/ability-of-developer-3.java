import java.util.Scanner;

public class Main {

    public static final int INT_MAX = Integer.MAX_VALUE;
    public static final int DEVELOPER = 6;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ability = new int[6];
        int abilitySum = 0;
        for (int i = 0; i < 6; i++)
        { 
            ability[i] = sc.nextInt();
            abilitySum += ability[i];
        }
        
        int answer = INT_MAX;
        for(int i = 0; i < DEVELOPER; i++)
            for(int j = i + 1; j < DEVELOPER; j++)
                for(int k = j + 1; k < DEVELOPER; k++)
                    answer = Math.min(answer, GetDiff(abilitySum, ability[i], ability[j], ability[k]));

        System.out.println(answer);
    }

    private static int GetDiff(int sum, int a, int b, int c)
    {
        int diff = 0;

        int teamA = (a + b + c);
        int teamB = sum - teamA;

        diff = Math.abs(teamA - teamB);

        return diff;
    }
}