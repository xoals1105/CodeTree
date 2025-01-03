import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a, n, m;

        a = sc.nextInt();
        n = sc.nextInt();

        m = a + n;

        for(int i = 0; i < n; i++) { 
            System.out.println(m); 
            m += n;           
        }

    }
}