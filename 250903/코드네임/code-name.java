import java.util.Scanner;

class Agent
{
    char codeName;
    int score;

    public Agent(char codeName, int score)
    {
        this.codeName = codeName;
        this.score = score; 
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Agent[] agent = new Agent[5];
        int min = 0;
        for(int i = 0; i < 5; i++)
        {
            char codeName = scanner.next().charAt(0);
            int score = scanner.nextInt();

            agent[i] = new Agent(codeName, score);
            
            if(agent[min].score > agent[i].score) min = i; 
        }

        System.out.println(agent[min].codeName + " " + agent[min].score); 
    }
}