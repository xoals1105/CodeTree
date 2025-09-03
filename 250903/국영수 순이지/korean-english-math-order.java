import java.util.Scanner;
import java.util.Arrays;

class Score
{
    String name = "";
    int korean = 0;
    int english = 0;
    int math = 0;

    public Score(String name, int korean, int english, int math)
    {
        this.name = name;
        this.korean = korean;
        this.english = english;
        this.math = math;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Score[] score = new Score[n];

        for (int i = 0; i < n; i++) {
            String names = sc.next();
            int korean = sc.nextInt();
            int english = sc.nextInt();
            int math = sc.nextInt();

            score[i] = new Score(names, korean, english, math);
        }
        
        Arrays.sort(score, (a, b) -> {
            if(a.korean != b.korean)
                return b.korean - a.korean;
            else if(a.english != b.english)
                return b.english - a.english;
            else
                return b.math - a.math;  
        });

        for(int i = 0; i < n; i++)
            System.out.println(score[i].name + " " + score[i].korean + " " + score[i].english + " " + score[i].math);
    }
}