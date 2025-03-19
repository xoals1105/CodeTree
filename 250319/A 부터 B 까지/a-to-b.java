import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a, b, i;

        a = sc.nextInt();
        b = sc.nextInt();

        i = a;

        while (i <= b) {
            System.out.print(i+" ");

            if(i % 2 == 0)
                i += 3;
            else
                i *= 2;    
        }        
        
    }
}