import java.util.Scanner;
import java.util.Arrays;

class Twopoint
{
    int x = 0;
    int y = 0;
    int index = 0;
    int distance = 0;

    public Twopoint(int x, int y, int index)
    {
        this.x = x;
        this.y = y;
        this.index = index;
        this.distance = Math.abs(x) + Math.abs(y);
        if(distance < 0)  distance *= -1;
    } 
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Twopoint[] twopoint = new Twopoint[n];
        

        for(int i = 0; i < n; i++)
        {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            twopoint[i] = new Twopoint(x, y, i + 1);
        }

        Arrays.sort(twopoint, (a, b) -> a.distance - b.distance);

        for(int i = 0; i < n; i++)
            System.out.println(twopoint[i].index);
       
    }
}