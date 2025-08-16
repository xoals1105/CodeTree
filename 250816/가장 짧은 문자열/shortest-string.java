import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String aa = sc.next();
        String bb = sc.next();
        String cc = sc.next();

        int a = aa.length();
        int b = bb.length();
        int c = cc.length();

         if(a>=b&&b>=c){
            System.out.print(a-c);
         }
         else if(a>=c&&c>=b){
            System.out.print(a-b);
         }
         else if(b>=a&&a>=c){
            System.out.print(b-c);
         }
         else if(b>=c&&c>=a){
            System.out.print(b-a);
         }
         else if(c>=a&&a>=b){
            System.out.print(c-b);
         }
         else if(c>=b&&b>=a){
            System.out.print(c-a);
         }

    }
}
