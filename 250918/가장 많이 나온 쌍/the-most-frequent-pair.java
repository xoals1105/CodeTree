import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[M];
        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            arr[a + b] += 1;
        }

        int answer = 0;
        for(int i = 0; i < arr.length; i++)
        {
            int num = arr[i];

            answer = Math.max(answer, num);
        }

        System.out.println(answer);
        
    }
}