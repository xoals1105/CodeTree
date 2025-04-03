import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n;

        n = sc.nextInt();

        for(int i = 1; i <= 100; i++) {

            n /= i;
            
            if(n <= 1){

                System.out.print(i);
                break;
            }
        }
    }
}