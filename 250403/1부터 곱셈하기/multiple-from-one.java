import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n, prod = 1;

        n = sc.nextInt();

        for(int i = 1; i <= 10; i++) {

            prod *= i;

            if(prod >= n) {
                
                System.out.print(i);
                break;
            }
        }
    }
}