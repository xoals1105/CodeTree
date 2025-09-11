import java.util.Scanner;

public class Main {

    public static final int INT_MAX = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int answer = INT_MAX;
        for(int i = 0; i <= n - t; i++)
        {
            
            int cost = 0;
            for(int j = 0; j < t; j++)
            {
                int num = arr[i + j];
                cost += Math.abs(num - h);
            }        
            answer = Math.min(answer, cost);  
        }        

        System.out.println(answer);
    }   
}