import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] section = new int[100];

        for (int i = 0; i < n; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();

            for(int j = start; j <= end; j++)
                section[j] += 1;
        }

        int max = 0;
        for(int i = 0; i < section.length; i++)
        {
            if(section[i] > max) max = section[i];
        }

        System.out.println(max);    
    }
}