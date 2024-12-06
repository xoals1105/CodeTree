import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        char asex, bsex;
        int aage, bage;

        aage = sc.nextInt();
        asex = sc.next().charAt(0);
        bage = sc.nextInt();
        bsex = sc.next().charAt(0);
        

        if ((aage >= 19 && asex == 'M') || (bage >= 19 && bsex == 'M'))
            System.out.println("1");
        else
            System.out.println("0");       
    }
}