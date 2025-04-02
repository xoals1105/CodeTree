import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n;

        n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            if(i % 2 == 0)
                continue;
            if(i ==5)
                continue;
            if(i % 3 == 0 && i % 9 != 0)
                continue;

            System.out.print(i + " ");     
        }
    }
}