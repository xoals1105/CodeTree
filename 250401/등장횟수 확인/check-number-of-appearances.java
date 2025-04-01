import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n;
        int cent = 0;

        for(int i = 1; i <= 5; i++) {
            n = sc.nextInt();

            if(n % 2 == 0)
                cent++;
        }

        System.out.print(cent);
        
    }
}