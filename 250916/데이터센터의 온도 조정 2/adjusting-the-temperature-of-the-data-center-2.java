import java.util.Scanner;
public class Main {

    public static final int INT_MIN = Integer.MIN_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int g = sc.nextInt();
        int h = sc.nextInt();
        int[] ta = new int[n];
        int[] tb = new int[n];
        for (int i = 0; i < n; i++) {
            ta[i] = sc.nextInt();
            tb[i] = sc.nextInt();
        }

        int bestWork = TemperaturePeakOperation(ta, tb, c, g, h);
        System.out.println(bestWork);
    }

    private static int TemperaturePeakOperation(int[] ta, int[] tb, int c, int g, int h)
    {
        int answer = INT_MIN;
        for(int i = 0; i <= 1000; i++)
        {
            int temperatureSum = 0;
            for(int j = 0; j < ta.length; j++)
            {
                if(i < ta[j])
                    temperatureSum += c;
                else if(i >= ta[j] && i <= tb[j])
                    temperatureSum += g;
                else if(i > tb[j])
                    temperatureSum += h;
            }

            answer = Math.max(answer, temperatureSum);
        }

        return answer;
    }
}