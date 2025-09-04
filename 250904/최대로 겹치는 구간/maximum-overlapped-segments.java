import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] section = new int[300];
        int[] section_second = new int[100];
        int[] section_three = new int[100];

        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();

            x1 += 100;
            x2 += 100;

            for(int j = x1; j <= x2; j++)
                section[j] += 1; 
        }

        int maxOverlap = 1;
        for(int i = 0; i < section.length; i++) {
            if(section[i] > maxOverlap)
                maxOverlap = section[i];
        }

        System.out.println(maxOverlap);
    }
}