import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a,b,c,d,e,f;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        e = sc.nextInt();
        f = sc.nextInt();

        if(a % 2 == 1 && a % 3 == 0)
            System.out.println(a);
        if(b % 2 == 1 && b % 3 == 0)
            System.out.println(b);
        if(c % 2 == 1 && c % 3 == 0)
            System.out.println(c);
        if(d % 2 == 1 && d % 3 == 0)
            System.out.println(d);
        if(e % 2 == 1 && e % 3 == 0)
            System.out.println(e);
        if(f % 2 == 1 && f % 3 == 0)
            System.out.println(f);
    }
}