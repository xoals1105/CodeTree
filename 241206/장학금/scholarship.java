import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a, b;

        a = sc.nextInt();
        b = sc.nextInt();

        if (a < 90 || b < 90)
            System.out.print("0");
        else if (b < 95)
            System.out.print("50000");
        else    
            System.out.print("100000");


    }
}