import java.util.Scanner;
public class Main {

    public static final int MAX = 1000000;

    public static int[] runA = new int[MAX];
    public static int[] runB = new int[MAX];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
       
        int  timeA = 1; 
        for (int i = 0; i < n; i++) 
        {
            int speed = sc.nextInt();
            int time = sc.nextInt();

            while(time-- > 0)
            {
                runA[timeA] = runA[timeA - 1] + speed;
                timeA++;
            }
        }

        int timeB = 1;
        for (int i = 0; i < m; i++) 
        {
            int speed = sc.nextInt();
            int time = sc.nextInt();

            while(time-- > 0)
            {
                runB[timeB] = runB[timeB - 1] + speed;
                timeB++;
            }
        }

        int maxTime = Math.max(timeA, timeB);
        int hallOfFame = 0, leader = 0;
        for(int i = 1; i < maxTime; i++)
        {
            // System.out.println(runA[i] + " " + runB[i]);
            if(runA[i] > runB[i]) 
            {
                if(leader == 2)
                    hallOfFame++;              
              
                leader = 1; 
            }
            else if(runA[i] < runB[i]) 
            {        
                if(leader == 1)
                    hallOfFame++;               
               
                leader = 2; 
            }

            else if(runA[i] == runB[i]) 
                hallOfFame++; 
        }

        System.out.println(hallOfFame);
    }
}