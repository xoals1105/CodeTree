import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        char a1, b1, c1;
        int a2, b2, c2;


        a1 = sc.next().charAt(0);
        a2 = sc.nextInt();
        b1 = sc.next().charAt(0);
        b2 = sc.nextInt();
        c1 = sc.next().charAt(0);
        c2 = sc.nextInt();

        if (a1 == 'Y' && b1 == 'Y') {
            if (a2 >= 37 && b2 >= 37)
                System.out.println("E");
            else
                System.out.println("N");
        }

        else if (a1 == 'Y' && c1 == 'Y') {
            if (a2 >= 37 && c2 >= 37)
                System.out.println("E");
            else
                System.out.println("N");
        }

        else if (b1 == 'Y' && c1 == 'Y'){
            if (b2 >= 37 && c2 >= 37)
                System.out.println("E");
            else
                System.out.println("N");
        }

        else 
            System.out.println("N");
        

    }
}