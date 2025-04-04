import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n, cent = 0;

        while(true) {

            n = sc.nextInt();

            if(n % 2 == 0) {

                System.out.println(n / 2);
                cent++;

                if(cent == 3)
                    break;
            }
        }
    }
}