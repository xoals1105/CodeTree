import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n;
        int m = 0;
        int k = 0;

        for(int i = 0; i < 10; i++) {
            n = sc.nextInt();
            
            if(n % 3 == 0)
                m += 1;
            if(n % 5 == 0)
                k += 1;
        }

        System.out.print(m+" ");
        System.out.print(k);
    }
}