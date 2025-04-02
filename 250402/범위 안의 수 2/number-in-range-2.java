import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n, cent = 0, sum = 0;
        double avg = 0;

        for(int i = 0; i < 10; i++) {
            n = sc.nextInt();

            if(0 <= n && n <= 200){
                sum += n;
                cent++;
            }
        }

        avg = (double)sum / cent;

        System.out.printf("%d %.1f", sum, avg);
    }
}