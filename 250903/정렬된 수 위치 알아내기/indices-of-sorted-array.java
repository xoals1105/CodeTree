import java.util.Scanner;
import java.util.Arrays;

class Number
{
    int index = 0;
    int arraysIndex = 0;
    int num = 0;

    public Number(int num, int index)
    {
        this.num = num;
        this.index = index;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Number[] number = new Number[n];
        
        for(int i = 0; i < n; i++)
        {
            int num = sc.nextInt();

            number[i] =  new Number(num, i + 1);
        }
        
        Arrays.sort(number, (a, b) -> a.num - b.num);

        int cnt = 1;
        for(int i = 0; i < n; i++)
        {
            number[i].arraysIndex = cnt;
            cnt++;
        }

       Arrays.sort(number, (a, b) -> a.index - b.index);

       for(int i = 0; i < n; i++)
            System.out.print(number[i].arraysIndex + " "); 
    }
}