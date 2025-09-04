import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] section = new int[100];
        int[] section_second = new int[100];
        int[] section_three = new int[100];

        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();

            for(int j = x1; j <= x2; j++)
                section[j] += 1; 
        }

        int line = 0;
        for(int i = 0; i < section.length; i++)
            if(section[i] > 1) line++;
        System.out.println(line);
    }
}