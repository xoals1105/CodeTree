import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char find = scanner.next().charAt(0);
        char[] word = new char[] {'L', 'E', 'B', 'R', 'O', 'S'};

        int idx = -1;

        for(int i = 0; i < 6; i++)
        {
            if(word[i] == find)
            {
                idx = i;
                break;
            }
        }

        if(idx == -1) System.out.print("None");
        else System.out.println(idx);
    }
}