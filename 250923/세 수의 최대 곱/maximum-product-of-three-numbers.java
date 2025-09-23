import java.util.Scanner;

public class Main {

    public static final int INT_MIN = Integer.MIN_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int answer = INT_MIN;
        for(int i = 0; i < n; i++)
            for(int j = i + 1; j < n; j++)
                for(int k = j + 1; k < n; k++)
                {
                    int num = calculation(arr[i], arr[j], arr[k]);
                    answer = Math.max(num, answer);
                }
                
        System.out.println(answer);   
    }

    private static int calculation(int a, int b, int c)
    {
        return a * b * c;
    }
}