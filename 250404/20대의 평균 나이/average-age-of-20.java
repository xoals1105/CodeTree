import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int a, sum = 0, cent = 0;
        double avg;

        while(true) {

            a = sc.nextInt();

            if(a < 20 || a >= 30)
                break;

            sum += a;
            cent++;
        }

        avg = (double)sum / cent;

        System.out.printf("%.2f", avg);
    }
}