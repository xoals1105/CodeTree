import java.util.Scanner;
import java.util.Arrays;

class AllScore
{
    String name = "";
    int score1 = 0;
    int score2 = 0;
    int score3 = 0;
    
    public AllScore(String name, int score1, int score2, int score3)
    {
        this.name = name;
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        AllScore[] allscore = new AllScore[n];

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int score1 = sc.nextInt();
            int score2 = sc.nextInt();
            int score3 = sc.nextInt();

            allscore[i] = new AllScore(name, score1, score2, score3);
        }

        Arrays.sort(allscore, (a, b) -> (a.score1 + a.score2 + a.score3) - (b.score1 + b.score2 + b.score3));

        for(int i = 0; i < n; i++)
            System.out.println(allscore[i].name + " " + allscore[i].score1 + " " + allscore[i].score2 + " " + allscore[i].score3);
        
    }
}